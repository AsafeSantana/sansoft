/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Usuario
 */
import DAO.DaoVendas;
import java.util.ArrayList;
import model.ModelVendas;

public class ControllerVendas {

    private final DaoVendas daoVendas;

    public ControllerVendas() {
        this.daoVendas = new DaoVendas();
    }

    public int salvarVendasController(ModelVendas pModelVendas) {
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    public ModelVendas getVendasController(int pIdVendas) {
        return this.daoVendas.getVendasDAO(pIdVendas);
    }

    public ArrayList<ModelVendas> getListaVendasController() {
        return this.daoVendas.getListaVendasDAO();
    }

    public boolean atualizarVendasController(ModelVendas pModelVendas) {
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    public boolean excluirVendasController(int pIdVendas) {
        return this.daoVendas.excluirVendasDAO(pIdVendas);
    }
}

