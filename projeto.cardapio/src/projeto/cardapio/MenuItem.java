package projeto.cardapio;

//import projeto.cardapio.Repositorio;

public class MenuItem {
    private String imagePath;
    private String Name;
    private String Description;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    

        public static MenuItem[] getItems(){
        MenuItem m1 = new MenuItem();
        m1.setName("Alcatra grelhada");
        m1.setDescription("Alcatra grelhada com batata rústica");
        m1.setImagePath("/projeto/cardapio/imagens/beef.png");
        
        MenuItem m2 = new MenuItem();
        m2.setName("Atum");
        m2.setDescription("Atum com legumes grelhados");
        m2.setImagePath("/projeto/cardapio/imagens/fish.png");
        
        MenuItem m3 = new MenuItem();
        m3.setName("Spaghetti");
        m3.setDescription("Spaghetti ao molho bolonhesa");
        m3.setImagePath("/projeto/cardapio/imagens/spaghetti.png");
        
        MenuItem m4 = new MenuItem();
        m4.setName("Salada verde");
        m4.setDescription("Salada de folhas verdes e tomate");
        m4.setImagePath("/projeto/cardapio/imagens/salad.png");
        
       
        return new MenuItem[]{m1, m2,m3,m4};
    }
    
}
