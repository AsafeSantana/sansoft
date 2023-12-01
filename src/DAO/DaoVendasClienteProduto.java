/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.ModelVendaClienteProduto;
import conexoes.ConexaoMySql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DaoVendasClienteProduto extends ConexaoMySql {

   
    public ArrayList<ModelVendaClienteProduto> listarVendasClienteProduto() {
        ArrayList<ModelVendaClienteProduto> vendas = new ArrayList<>();

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                            + "pk_id_vendas, "
                    + "CliNome, "
                    + "CliCidade, "
                    + "CliUf, "
                    + "CliTelefone, "
                    + "ProNome, "
                    + "ProValor,"
                    + "VenProValor, "
                    + "VenProQuantidade, "
                    + "VenValorLiquido, "
                    + "VenValorBruto,"
                    + "VenDesconto, "
                    + "VenDataVenda "
                    + "FROM "
                    + "nova_view"
            );

            ResultSet resultSet = this.getResultSet();

            while (resultSet.next()) {
                ModelVendaClienteProduto venda = new ModelVendaClienteProduto();
                venda.setPk_id_vendas(resultSet.getInt("Pk_id_vendas"));
                venda.setCliNome(resultSet.getString("CliNome"));
                venda.setCliCidade(resultSet.getString("CliCidade"));
                venda.setCliUf(resultSet.getString("CliUf"));
                venda.setCliTelefone(resultSet.getString("CliTelefone"));
                venda.setProNome(resultSet.getString("ProNome"));
                venda.setProValor(resultSet.getDouble("ProValor"));
                venda.setVenProValor(resultSet.getDouble("VenProValor"));
                venda.setVenProQuantidade(resultSet.getInt("VenProQuantidade"));
                venda.setVenValorLiquido(resultSet.getDouble("VenValorLiquido"));
                venda.setVenValorBruto(resultSet.getDouble("VenValorBruto"));
                venda.setVenDesconto(resultSet.getDouble("VenDesconto"));
               venda.setVenDataVenda(resultSet.getDate("VenDataVenda"));
               

                vendas.add(venda);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return vendas;
    }
    
  public ModelVendaClienteProduto obterDetalhesDaVenda(int codigoVenda) {
    ModelVendaClienteProduto venda = null;

    try {
        this.conectar();
        this.executarSQL(
             "SELECT "
                     + "pk_id_vendas, "
                    + "CliNome, "
                    + "CliCidade, "
                    + "CliUf, "
                    + "CliTelefone, "
                    + "ProNome, "
                    + "ProValor,"
                    + "VenProValor, "
                    + "VenProQuantidade, "
                    + "VenValorLiquido, "
                    + "VenValorBruto,"
                    + "VenDesconto, "
                    + "VenDataVenda "
                    + "FROM nova_view "
+ "WHERE pk_id_vendas = " + codigoVenda
        );

        ResultSet resultSet = this.getResultSet();

        if (resultSet.next()) {
            venda = new ModelVendaClienteProduto();
            venda.setPk_id_vendas(resultSet.getInt("Pk_id_vendas"));
            venda.setCliNome(resultSet.getString("CliNome"));
                venda.setCliCidade(resultSet.getString("CliCidade"));
                venda.setCliUf(resultSet.getString("CliUf"));
                venda.setCliTelefone(resultSet.getString("CliTelefone"));
                venda.setProNome(resultSet.getString("ProNome"));
                venda.setProValor(resultSet.getDouble("ProValor"));
                venda.setVenProValor(resultSet.getDouble("VenProValor"));
                venda.setVenProQuantidade(resultSet.getInt("VenProQuantidade"));
                venda.setVenValorLiquido(resultSet.getDouble("VenValorLiquido"));
                venda.setVenValorBruto(resultSet.getDouble("VenValorBruto"));
                venda.setVenDesconto(resultSet.getDouble("VenDesconto"));
                venda.setVenDataVenda(resultSet.getDate("VenDataVenda"));
                
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    return venda;
}
}
