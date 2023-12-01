/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Usuario
 */
public class ControllerProdutos {
    
    private DaoProdutos daoProdutos = new DaoProdutos();
    
    /**
     * Salvar produtos controller.
     * @param pModelProdutos
     * @return 
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    /**
     * excluir produto pelo código
     * @param pCodigo
     * @return 
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    /**
     * Alterar produto pelo código.
     * @param pModelProdutos
     * @return 
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    /**
     * retornar produto pelo código
     * @param pCodigo
     * @return 
     */
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    /**
     * retornar produto pelo código
     * @param pNomeProduto 
     * @return 
     */
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    /**
     * retornar uma lista de produtos.
     * @return lista model produtos.
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
    return this.daoProdutos.retornarListaProdutosDAO();
    } 

    
    //alterar lista de produtos no banco
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> plistaModelProdutoses) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(plistaModelProdutoses);
    }
}
