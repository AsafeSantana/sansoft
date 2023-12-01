/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ModelVendasCliente {
    
    private ModelVendas modelVendas;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendasCliente> listaModelVendasClientes;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelVendasClientes
     */
    public ArrayList<ModelVendasCliente> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param listaModelVendasClientes the listaModelVendasClientes to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasCliente> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
}
