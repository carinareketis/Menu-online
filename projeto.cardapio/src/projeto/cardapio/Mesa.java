/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.cardapio;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Mesa {
    private int ID;
    private int numero;
    private Funcionario funcionario;
    private ArrayList<Pedido> pedidos;
    
    
    public Mesa(){
        this.pedidos = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
        
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pedido[] getPedidos() {
        return this.pedidos.toArray(new Pedido[this.pedidos.size()]);
    }

    public void addPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }

 
    
}
