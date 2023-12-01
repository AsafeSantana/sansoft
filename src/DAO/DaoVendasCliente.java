/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendas;
import model.ModelVendasCliente;
import model.ModelCliente;

/**
 *
 * @author Usuario
 */
public class DaoVendasCliente  extends ConexaoMySql{
    
    
    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO() {
     ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList<>();
        ModelVendas modelVendas= new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente  modelVendasCliente = new ModelVendasCliente();
        try {
        this.conectar();
        this.executarSQL(
        " SELECT "
                + "tbl_vendas.pk_id_vendas,"
                + "tbl_vendas.fk_cliente,"
                + "tbl_vendas.ven_data_venda,"
                + "tbl_vendas.ven_valor_liquido,"
                + "tbl_vendas.ven_valor_bruto,"
                + "tbl_vendas.ven_desconto,"
                + "tbl_cliente.pk_id_cliente,"
                + "tbl_cliente.cli_nome,"
                + "tbl_cliente.cli_endereco,"
                + "tbl_cliente.cli_bairro,"
                + "tbl_cliente.cli_cidade,"
                + "tbl_cliente.cli_uf,"
                + "tbl_cliente.cli_cep,"
                + "tbl_cliente.cli_telefone"
                + " FROM "
                + "tbl_vendas INNER JOIN tbl_cliente "
                + "ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente;"
        +";"
        );
            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                
                
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                
               
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));
                modelCliente.setCliEndereco(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliUf(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                
                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listaModelVendasCliente.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    
}
}
