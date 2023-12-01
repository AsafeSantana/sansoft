/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.util.ArrayList;
import model.ModelVendaClienteProduto; // Importe o novo modelo aqui

public class ImprimirLista {
    
    private ModelVendaClienteProduto modelVendaClienteProduto; // Atualize o tipo do modelo aqui

    public ModelVendaClienteProduto getModelVendaClienteProduto() {
        return modelVendaClienteProduto;
    }

    public void setModelVendaClienteProduto(ModelVendaClienteProduto modelVendaClienteProduto) {
        this.modelVendaClienteProduto = modelVendaClienteProduto;
    }
    
    public static ArrayList<ImprimirLista> criarLista(ModelVendaClienteProduto vendaClienteProduto) {
        ArrayList<ImprimirLista> listaImprimir = new ArrayList<>();
        ImprimirLista imprimirLista = new ImprimirLista();
        imprimirLista.setModelVendaClienteProduto(vendaClienteProduto);
        listaImprimir.add(imprimirLista);
        return listaImprimir;
    }
}
