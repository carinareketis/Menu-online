package projeto.cardapio.UI;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class JTableAlign {

    public static DefaultTableCellRenderer CENTER(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        return centerRenderer;
    }
    
    public static DefaultTableCellRenderer LEFT(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.LEFT );
        return centerRenderer;
    }
    
    public static DefaultTableCellRenderer RIGHT(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.RIGHT );
        return centerRenderer;
    }
    
    
    
}
