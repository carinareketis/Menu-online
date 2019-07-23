/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.cardapio;

import java.util.ArrayList;

/**
 *
 * @author HTK
 */
public class Pedido {
    private int ID;
    private ArrayList<Prato> pratos;
    private ArrayList<Bebida> bebidas;
    
    public Pedido(){
        this.bebidas = new ArrayList<>();
        this.pratos = new ArrayList<>();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Prato[] getPratos() {
        return pratos.toArray(new Prato[pratos.size()]);
    }

    public void addPratos(Prato prato) {
        this.pratos.add(prato);
    }

    public Bebida[] getBebidas() {
         return bebidas.toArray(new Bebida[bebidas.size()]);
    }

    public void addBebidas(Bebida bebida) {
        this.bebidas.add(bebida);
    }
    
    @Override
    public String toString(){
        String result = "";
        for(Prato p : this.pratos) result += "prato: " + p.getNome() + "\n";
        for(Bebida b : this.bebidas) result += "bebida: " + b.getNome() + "\n";
        return result;
    }


}
