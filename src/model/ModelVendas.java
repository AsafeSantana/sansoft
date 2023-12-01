/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ModelVendas {
    
    private int idVendas;
    private int Cliente;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;

    /**
     * @return the idVendas
     */
    public int getIdVendas() {
        return idVendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    /**
     * @return the Cliente
     */
    public int getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the venDataVenda
     */
    public Date getVenDataVenda() {
        return venDataVenda;
    }

    /**
     * @param venDataVenda the venDataVenda to set
     */
    public void setVenDataVenda(Date venDataVenda) {
        this.venDataVenda = venDataVenda;
    }

    /**
     * @return the venValorLiquido
     */
    public double getVenValorLiquido() {
        return venValorLiquido;
    }

    /**
     * @param venValorLiquido the venValorLiquido to set
     */
    public void setVenValorLiquido(double venValorLiquido) {
        this.venValorLiquido = venValorLiquido;
    }

    /**
     * @return the venValorBruto
     */
    public double getVenValorBruto() {
        return venValorBruto;
    }

    /**
     * @param venValorBruto the venValorBruto to set
     */
    public void setVenValorBruto(double venValorBruto) {
        this.venValorBruto = venValorBruto;
    }

    /**
     * @return the venDesconto
     */
    public double getVenDesconto() {
        return venDesconto;
    }

    /**
     * @param venDesconto the venDesconto to set
     */
    public void setVenDesconto(double venDesconto) {
        this.venDesconto = venDesconto;
    }

    public void setVenDataVenda(String dataFormatada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
