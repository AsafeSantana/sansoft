/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoUsuario;
import java.util.ArrayList;
import model.ModelUsuario;

/**
 *
 * @author Usuario
 */
public class ControllerUsuario {
    
    private DaoUsuario  daoUsuario = new DaoUsuario();
    
    /**
     * salvar usuario controller.
     * @param pModelUsuario
     * @return 
     */
    public int salvarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }
    
    /**
     * recupera usuario
     * @param IdUsuario
     * @return 
     */
    public ModelUsuario getUsuarioController(int IdUsuario){
        return this.daoUsuario.getUsuarioDAO(IdUsuario);
    }
    
    /**
     * recupera lista de usuarios
     * @return 
     */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }
    
    
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }
    
    
    /**
     * exclui usuario pelo código.
     * @param pCodigo
     * @return 
     */
    public boolean excluirUsuarioController(int pCodigo){ // Adicionando um argumento para o código do usuário
        return this.daoUsuario.excluirUsuarioDAO(pCodigo);
    }
    
    /**
     * alterar usuario pelo codigo.
     * @param pModelUsuario
     * @return 
     */
    public boolean alterarUsuarioController(ModelUsuario pModelUsuario){
    return this.alterarUsuarioController(pModelUsuario);
    }

    /**
     * validar login e senha do usuario
     * @param pModelUsuario 
     */
    public boolean getValidarUsuarioController(ModelUsuario  pModelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
    }

    
    
    
   
    
    
}
