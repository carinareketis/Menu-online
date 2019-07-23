package projeto.cardapio;

import java.util.ArrayList;

public class Repositorio {


    private static int ultimoIDBebida = 0;
    private static int ultimoIDFuncao = 0;
    private static int ultimoIDFuncionario = 0;
    private static int ultimoIDMesa = 0;
    private static int ultimoIDPedido = 0;
    private static int ultimoIDPrato = 0;
    
  
    
                     

    private static ArrayList<Bebida> bebidas = new ArrayList<>();
    private static ArrayList<Funcao> funcoes = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList<Mesa> mesas = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Prato> pratos = new ArrayList<>();
    

    public Repositorio() {this.seed();}

        //public void adicionarPrato(Prato prato) {        prato.setID(++ultimoIDPrato);        this.pratos.add(prato);    }
    
        public void adicionarBebida(Bebida bebida){
            bebida.setID(++ultimoIDBebida);
            Repositorio.bebidas.add(bebida);
        }
    
    //public Prato[] obterListaDePratos() {        return Repositorio.pratos.toArray(            new Prato[Repositorio.pratos.size()]        );    }
        
        public Bebida[]obterListaDeBebidas(){
            return Repositorio.bebidas.toArray(
            new Bebida[Repositorio.bebidas.size()]);
        }
    
    public void removerBebida(int ID){
        Bebida toRemove = null;
        for (Bebida b : Repositorio.bebidas){
            if(b.getID() == ID){
                toRemove = b;
            break;
            }
        }
            if(toRemove != null) Repositorio.bebidas.remove(toRemove);
    }        
    
        public void adicionarFuncao(Funcao funcao){
        funcao.setID(++ultimoIDFuncao);
        Repositorio.funcoes.add(funcao);
    }
    
    public Funcao[] obterListaDeFuncoes() {
        return Repositorio.funcoes.toArray(
            new Funcao[Repositorio.funcoes.size()]
        );
    }    
    
    public void alterarFuncao(int ID, String nome) {
        for(Funcao f : Repositorio.funcoes){
            if(f.getID() == ID) f.setNome(nome);
        }
    }
    
    public void removerFuncao(int ID){
        Funcao toRemove = null;
        for(Funcao f : funcoes){
            if(f.getID() == ID){
                toRemove = f;
            break;
            }
        }
        if(toRemove != null) Repositorio.funcoes.remove(toRemove);
    }
 
    public void adicionarFuncionario(Funcionario funcionario){
        funcionario.setID(++ultimoIDFuncionario);
        this.funcionarios.add(funcionario);
    }
    
    public Funcionario[]obterListaDeFuncionarios(){
    return Repositorio.funcionarios.toArray(
        new Funcionario[Repositorio.funcionarios.size()]
    );
}
    
    public void removerFuncionario(int ID){
        Funcionario toRemove = null;
        for(Funcionario t : funcionarios){
            if(t.getID() == ID){
                toRemove = t;
                break;
            }
        }
        if(toRemove != null) Repositorio.funcionarios.remove(toRemove);
    }
    
    public void adicionarMesa(Mesa mesa){
        mesa.setID(++ultimoIDMesa);
       Repositorio.mesas.add(mesa);
    }
    
    public Mesa[] obterListaDeMesas(){
        return Repositorio.mesas.toArray(
            new Mesa[Repositorio.mesas.size()]
        );
    }
    
    public void removerMesa(int ID){
    Mesa toRemove = null;
    for (Mesa m : Repositorio.mesas){
        if(m.getID() == ID){
            toRemove = m;
            break;
        }
    }
    if(toRemove != null) Repositorio.mesas.remove(toRemove);
}    
        
    public void adicionarPedido(Pedido pedido){
        pedido.setID(++ultimoIDPedido);
        Repositorio.pedidos.add(pedido);
    }
    
    public Pedido[] obterListaDePedido(){
        return Repositorio.pedidos.toArray(
                new Pedido[Repositorio.pedidos.size()]
        );
    }
    
    public void removerPedido(int ID){
            Pedido toRemove = null;
    for (Pedido t : Repositorio.pedidos){
            if(t.getID() == ID){
                toRemove  = t;
                break;
            }
    }
    if(toRemove != null) Repositorio.pedidos.remove(toRemove);
    }
    
public void adicionarPrato(Prato prato){
    prato.setID(++ultimoIDPrato);
    Repositorio.pratos.add(prato);
}
    
        //public Prato[] obterListaDePratos() {        return Repositorio.pratos.toArray(            new Prato[Repositorio.pratos.size()]        );    }
        
        public Prato[]obterListaDePratos(){return Repositorio.pratos.toArray(new Prato[Repositorio.pratos.size()]);}
    
        public void removerPrato(int ID){
            Prato toRemove = null;
                for (Prato p : Repositorio.pratos){
                        if(p.getID() == ID){
                            toRemove = p;
                            break;
                        }
                }
                if(toRemove != null) Repositorio.pratos.remove(toRemove);
        }    

    
public void seed() {
    
    if (
            Repositorio.funcoes.isEmpty() && 
            Repositorio.funcionarios.isEmpty() &&
            Repositorio.bebidas.isEmpty() &&
            Repositorio.pratos.isEmpty() &&
            Repositorio.mesas.isEmpty() &&
            Repositorio.pedidos.isEmpty()
            ){
        Funcao funcao1 = new Funcao();
        funcao1.setNome("Cozinheiro");
        this.adicionarFuncao(funcao1);
        
        Funcao funcao2 = new Funcao();
        funcao2.setNome("Garçom");
        this.adicionarFuncao(funcao2);
        
        Funcao funcao3 = new Funcao();
        funcao3.setNome("Gerente");
        this.adicionarFuncao(funcao3);
        
        Funcao funcao4= new Funcao();
        funcao4.setNome("Sushiman");
        this.adicionarFuncao(funcao4);
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sergio Bill");
        funcionario.setFuncao(funcao4);
        this.adicionarFuncionario(funcionario);
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("José");
        funcionario1.setFuncao(funcao2);
        this.adicionarFuncionario(funcionario1);
        
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Geraldo");
        funcionario2.setFuncao(funcao1);
        this.adicionarFuncionario(funcionario2);
        
       Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("João");
        funcionario3.setFuncao(funcao2);
        this.adicionarFuncionario(funcionario3);
        
        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("Carlos");
        funcionario4.setFuncao(funcao3);
        this.adicionarFuncionario(funcionario4);
               
        Bebida bebida = new Bebida();
        bebida.setNome("Coca-cola");
        this.adicionarBebida(bebida);
        
        Bebida bebida2 = new Bebida();
        bebida2.setNome("Guaraná");
        this.adicionarBebida(bebida2);
        
        Bebida bebida3 = new Bebida();
        bebida3.setNome("Heineken");
        this.adicionarBebida(bebida3);
        
        Bebida bebida4 = new Bebida();
        bebida4.setNome("Ice Tea Limão");
        this.adicionarBebida(bebida4);
        
        Prato prato = new Prato();
        prato.setNome("Temaki Salmão");
        this.adicionarPrato(prato);
        
        Prato prato2 = new Prato();
        prato2.setNome("Temaki Skin");
        this.adicionarPrato(prato2);
        
        Prato prato3 = new Prato();
        prato3.setNome("Temaki California");
        this.adicionarPrato(prato3);
        
        Prato prato4 = new Prato();
        prato4.setNome("Temaki Atum");
        this.adicionarPrato(prato4);
        
        Mesa mesa = new Mesa();
        mesa.setNumero(1);
        mesa.setFuncionario(funcionario);
        this.adicionarMesa(mesa);
        
        Mesa mesa2 = new Mesa();
        mesa2.setNumero(2);
         mesa2.setFuncionario(funcionario2);
        this.adicionarMesa(mesa2);
        
        Mesa mesa3 = new Mesa();
        mesa3.setNumero(3);
         mesa3.setFuncionario(funcionario3);
        this.adicionarMesa(mesa3);
        
       Mesa mesa4 = new Mesa();
        mesa4.setNumero(4);
         mesa4.setFuncionario(funcionario4);
        this.adicionarMesa(mesa4);
        
         Mesa mesa5 = new Mesa();
        mesa5.setNumero(5);
         mesa5.setFuncionario(funcionario);
        this.adicionarMesa(mesa5);
                 
        Pedido p = new Pedido();
        p.addPratos(prato);
        p.addBebidas(bebida);
        
         Pedido p2 = new Pedido();
        p2.addPratos(prato3);
        p2.addBebidas(bebida2);
        
        mesa2.addPedidos(p2);
    
    }
   
    }
}



