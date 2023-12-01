/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVendasProdutos;
import java.util.ArrayList;
import model.ModelVendasProdutos;

/**
 *
 * @author Usuario
 */
public class ControllerVendasProdutos {
    
    private DaoVendasProdutos daoVendasProdutos = new DaoVendasProdutos();

    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    public ModelVendasProdutos getVendasProdutosController(int pIdVendaProduto) {
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController() {
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    public boolean excluirVendasProdutosController(int pIdVendaProduto) {
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }
  
    //salva uma lista de produtos na venda
    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> plistaModelVendasProdutoses) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(plistaModelVendasProdutoses);
    }
    
    
    
    
}
