/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.ModelUsuario;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 * salvar usuario no banco.
 *
 * @author Usuario
 */
public class DaoUsuario extends ConexaoMySql {

    public int salvarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_usuario ("
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha"
                    + ") VALUES ("
                    + "'" + pModelUsuario.getUsuNome() + "',"
                    + "'" + pModelUsuario.getUsuLogin() + "',"
                    + "'" + pModelUsuario.getUsuSenha() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera usuario
     *
     * @param pIdUsuario
     * @return
     */
    public ModelUsuario getUsuarioDAO(int pIdUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT pk_id_usuario, usu_nome, usu_login, usu_senha FROM tbl_usuario WHERE pk_id_usuario = '" + pIdUsuario + "';"
            );

            if (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString(2));
                modelUsuario.setUsuLogin(this.getResultSet().getString(3));
                modelUsuario.setUsuSenha(this.getResultSet().getString(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelUsuario;
    }

    /**
     * recupera lista de usuarios.
     *
     * @return
     */
    public ArrayList<ModelUsuario> getListaUsuarioDAO() {
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList<>();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT pk_id_usuario,usu_nome, usu_login,usu_senha FROM  tbl_usuario;"
                    + ";"
            );

            while (this.getResultSet().next()) {
                ModelUsuario modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt("pk_id_usuario"));
                modelUsuario.setUsuNome(this.getResultSet().getString("usu_nome"));
                modelUsuario.setUsuLogin(this.getResultSet().getString("usu_login"));
                modelUsuario.setUsuSenha(this.getResultSet().getString("usu_senha"));
                listamodelUsuario.add(modelUsuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listamodelUsuario;
    }

    /**
     * atualiza usuario.
     *
     * @param pModelUsuario
     * @return
     */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    " UPDATE tbl_usuario SET "
                    + "usu_nome = '" + pModelUsuario.getUsuNome() + "', "
                    + "usu_login = '" + pModelUsuario.getUsuLogin() + "', "
                    + "usu_senha = '" + pModelUsuario.getUsuSenha() + "' "
                    + " WHERE "
                    + " pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    " DELETE FROM tbl_usuario "
                    + " WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * validar login e senha usuario.
     * @param pModelUsuario
     * @return 
     */
    public boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha "
                    + "FROM tbl_usuario "
                    + "WHERE usu_login = '" + pModelUsuario.getUsuLogin() + "' AND usu_senha = '" + pModelUsuario.getUsuSenha() + "'"
                    + ";"
            );

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

}
