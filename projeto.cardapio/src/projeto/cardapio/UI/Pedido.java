package projeto.cardapio.UI;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import projeto.cardapio.MenuItem;

public class Pedido extends javax.swing.JFrame {
    public Pedido() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        MenuItem[] items = MenuItem.getItems();
        
        lbNome.setText(items[0].getName());
        lbDesc.setText(items[0].getDescription());
                
        URL path = getClass().getResource(items[0].getImagePath());
        ImageIcon icon = new ImageIcon(path);
        lbImagem.setIcon(icon);
        
        lbNome1.setText(items[1].getName());
        lbDesc1.setText(items[1].getDescription());
                
        URL path1 = getClass().getResource(items[1].getImagePath());
        ImageIcon icon1 = new ImageIcon(path1);
        lbImagem1.setIcon(icon1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbDesc1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbImagem = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbNome1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbDesc = new javax.swing.JLabel();
        lbImagem1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Pedir");

        lbDesc1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lbDesc1.setText("jLabel3");

        jScrollPane1.setViewportView(lbImagem);

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNome.setText("jLabel2");

        lbNome1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNome1.setText("jLabel2");

        lbDesc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lbDesc.setText("jLabel3");
        jScrollPane2.setViewportView(lbDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome1)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDesc1)))
                .addContainerGap(2759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lbNome1)
                        .addGap(33, 33, 33)
                        .addComponent(lbNome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbDesc1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(lbImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pedido().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbDesc1;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbImagem1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    // End of variables declaration//GEN-END:variables
}
