/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoCliente;
import java.util.ArrayList;
import model.ModelCliente;

/**
 *
 * @author Usuario
 */
public class ControllerCliente {
    
    private DaoCliente daoCliente = new DaoCliente();
    
    /**
     * grava cliente.
     * @param pModelCliente
     * @return 
     */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }
    
    /**
     * recupera cliente 
     * 
     */
    public ModelCliente getClienteController(int pIdCliente){
        return this.daoCliente.getClienteDAO(pIdCliente);
    }
    /**
     * recupera cliente 
     * 
     */
    public ModelCliente getClienteController(String pNomeCliente){
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }
    
    /**
     * recupera uma lista de cliente.
     * @return 
     */
    public ArrayList<ModelCliente> getListaClienteCOntroller(){
        return this.daoCliente.getListaClienteDAO();
    }
    
    /**
     * atualiza cliente.
     * @param pModelCliente
     * @return 
     */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }
    
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}
