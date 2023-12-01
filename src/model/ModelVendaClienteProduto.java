/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author Usuario
 */
public class ModelVendaClienteProduto {
    
    private String cliNome;
    private String cliCidade;
    private String cliUf;
    private String cliTelefone;
    private String proNome;
    private double proValor;
    private double venProValor;
    private int venProQuantidade;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;
    private Date venDataVenda;
    private int pk_id_vendas;
    
    
private String venDataVendaFormatada;

public String getVenDataVendaFormatada() {
    return venDataVendaFormatada;
}

public void setVenDataVendaFormatada(String venDataVendaFormatada) {
    this.venDataVendaFormatada = venDataVendaFormatada;
}

   
    @Override
    public String toString() {
        return "ModelVendaClienteProduto{" +
                "cliNome='" + getCliNome() + '\'' +
                ", cliCidade='" + getCliCidade() + '\'' +
                ", cliUf='" + getCliUf() + '\'' +
                ", cliTelefone='" + getCliTelefone() + '\'' +
                ", proNome='" + getProNome() + '\'' +
                ", proValor='" + getProValor() + '\'' + // Note que proValor é uma String, certifique-se de que está correto
                ", venProValor='" + getVenProValor() + '\'' + // Idem para venProValor
                ", venProQuantidade='" + getVenProQuantidade() + '\'' + // Idem para venProQuantidade
                ", venValorLiquido='" + getVenValorLiquido() + '\'' + // Idem para venValorLiquido
                ", venValorBruto='" + getVenValorBruto() + '\'' + // Idem para venValorBruto
                ", venDesconto='" + getVenDesconto() + '\'' + // Idem para venDesconto
                ", venDataVenda='" + getVenDataVenda() + '\'' + // Idem para venDataVenda
                ", pk_id_vendas='" + getPk_id_vendas() + '\'' + // Idem para pk_id_vendas
                '}';
    }

    /**
     * @return the cliNome
     */
    public String getCliNome() {
        return cliNome;
    }

    /**
     * @param cliNome the cliNome to set
     */
    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    /**
     * @return the cliCidade
     */
    public String getCliCidade() {
        return cliCidade;
    }

    /**
     * @param cliCidade the cliCidade to set
     */
    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    /**
     * @return the cliUf
     */
    public String getCliUf() {
        return cliUf;
    }

    /**
     * @param cliUf the cliUf to set
     */
    public void setCliUf(String cliUf) {
        this.cliUf = cliUf;
    }

    /**
     * @return the cliTelefone
     */
    public String getCliTelefone() {
        return cliTelefone;
    }

    /**
     * @param cliTelefone the cliTelefone to set
     */
    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    /**
     * @return the proNome
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * @param proNome the proNome to set
     */
    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    /**
     * @return the proValor
     */
    public double getProValor() {
        return proValor;
    }

    /**
     * @param proValor the proValor to set
     */
    public void setProValor(double proValor) {
        this.proValor = proValor;
    }

    /**
     * @return the venProValor
     */
    public double getVenProValor() {
        return venProValor;
    }

    /**
     * @param venProValor the venProValor to set
     */
    public void setVenProValor(double venProValor) {
        this.venProValor = venProValor;
    }

    /**
     * @return the venProQuantidade
     */
    public int getVenProQuantidade() {
        return venProQuantidade;
    }

    /**
     * @param venProQuantidade the venProQuantidade to set
     */
    public void setVenProQuantidade(int venProQuantidade) {
        this.venProQuantidade = venProQuantidade;
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
     * @return the pk_id_vendas
     */
    public int getPk_id_vendas() {
        return pk_id_vendas;
    }

    /**
     * @param pk_id_vendas the pk_id_vendas to set
     */
    public void setPk_id_vendas(int pk_id_vendas) {
        this.pk_id_vendas = pk_id_vendas;
    }

    
    
}
