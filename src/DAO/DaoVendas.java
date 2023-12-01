/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import model.ModelVendas;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DaoVendas extends ConexaoMySql {
    
    
    /**
     * salva vendas.
     * @param pModelVendas
     * @return 
     */
    public int salvarVendasDAO(ModelVendas pModelVendas){
    try{
        this.conectar();
        return this.insertSQL(
                "INSERT INTO tbl_vendas ("
        + "fk_cliente,"
        +"ven_data_venda,"
        +"ven_valor_liquido,"
        +"ven_valor_bruto,"
        +"ven_desconto"
                +") VALUES ("
                + "'" + pModelVendas.getCliente()+"',"
                + "'" + pModelVendas.getVenDataVenda()+"',"
                + "'" + pModelVendas.getVenValorLiquido()+"',"
                +"'" + pModelVendas.getVenValorBruto()+"',"
                +"'" + pModelVendas.getVenDesconto()+"'"
                +");"
              );
    }catch(Exception e){
        e.printStackTrace();
        return 0;
    }finally{
        this.fecharConexao();
    }
    }
    
    public ModelVendas getVendasDAO(int pIdVendas) {
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT pk_id_vendas, cliente, ven_data_venda, ven_valor_liquido, ven_valor_bruto, ven_valor_desconto  FROM tbl_vendas WHERE pk_id_vendas = '" +  pIdVendas + "';"
            );
            if (this.getResultSet().next()) {
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendas;
    }

    public ArrayList<ModelVendas> getListaVendasDAO() {
        ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
            "SELECT pk_id_vendas, cliente, ven_data_venda, ven_valor_liquido, ven_valor_bruto, ven_valor_desconto  FROM tbl_vendas;"
            +";"
            );
            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                listaModelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendas;
    }

    public boolean atualizarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas SET "
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "ven_data_venda = '" + pModelVendas.getVenDataVenda() + "',"
                   +  "ven_valor_liquido = '" +   pModelVendas.getVenValorLiquido() + "',"
                   + "ven_valor_bruto = '" + pModelVendas.getVenValorBruto() + "',"
                   + "ven_desconto = '" +  pModelVendas.getVenDesconto() + "'"
                   + " WHERE "
                   + "pk_id_vendas = '" + pModelVendas.getIdVendas() + "'"
              
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirVendasDAO(int pIdVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                " DELETE FROM tbl_vendas "
                  +  "WHERE "
                        + "pk_id_vendas = '" + pIdVendas + "'"
                    + ";"
                
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

   
    
}
