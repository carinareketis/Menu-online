package projeto.cardapio.UI;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import projeto.cardapio.MenuItem;


public class Menu extends javax.swing.JFrame {
    int contador = 0;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    
    
    public Menu() throws IOException {
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
        
        lbNome2.setText(items[2].getName());
        lbDesc2.setText(items[2].getDescription());
                
        URL path2 = getClass().getResource(items[2].getImagePath());
        ImageIcon icon2 = new ImageIcon(path2);
        lbImagem2.setIcon(icon2);
        
        lbNome3.setText(items[3].getName());
        lbDesc3.setText(items[3].getDescription());
                
        URL path3 = getClass().getResource(items[3].getImagePath());
        ImageIcon icon3 = new ImageIcon(path3);
        lbImagem3.setIcon(icon3);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbImagem = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        lbImagem1 = new javax.swing.JLabel();
        lbNome1 = new javax.swing.JLabel();
        lbDesc1 = new javax.swing.JLabel();
        lbImagem2 = new javax.swing.JLabel();
        lbNome2 = new javax.swing.JLabel();
        lbDesc2 = new javax.swing.JLabel();
        lbImagem3 = new javax.swing.JLabel();
        lbNome3 = new javax.swing.JLabel();
        lbDesc3 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        result1 = new javax.swing.JLabel();
        remove1 = new javax.swing.JButton();
        result2 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        remove2 = new javax.swing.JButton();
        remove3 = new javax.swing.JButton();
        result3 = new javax.swing.JLabel();
        add3 = new javax.swing.JButton();
        jButtonOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 0, 0));
        lbNome.setText("lbNome");

        lbDesc.setText("lbDesc");

        lbNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome1.setForeground(new java.awt.Color(204, 0, 0));
        lbNome1.setText("lbNome1");

        lbDesc1.setText("lbDesc1");

        lbNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome2.setForeground(new java.awt.Color(204, 0, 0));
        lbNome2.setText("lbNome2");

        lbDesc2.setText("lbDesc2");

        lbNome3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome3.setForeground(new java.awt.Color(204, 0, 0));
        lbNome3.setText("lbNome3");

        lbDesc3.setText("lbDesc3");

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/remove.png"))); // NOI18N
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("0");

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/add.png"))); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        add1.setBackground(new java.awt.Color(255, 255, 255));
        add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/add.png"))); // NOI18N
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        result1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result1.setText("0");

        remove1.setBackground(new java.awt.Color(255, 255, 255));
        remove1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/remove.png"))); // NOI18N
        remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove1ActionPerformed(evt);
            }
        });

        result2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result2.setText("0");

        add2.setBackground(new java.awt.Color(255, 255, 255));
        add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/add.png"))); // NOI18N
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        remove2.setBackground(new java.awt.Color(255, 255, 255));
        remove2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/remove.png"))); // NOI18N
        remove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove2ActionPerformed(evt);
            }
        });

        remove3.setBackground(new java.awt.Color(255, 255, 255));
        remove3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/remove.png"))); // NOI18N
        remove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove3ActionPerformed(evt);
            }
        });

        result3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result3.setText("0");

        add3.setBackground(new java.awt.Color(255, 255, 255));
        add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/add.png"))); // NOI18N
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbImagem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(lbImagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbImagem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDesc3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome3)
                            .addComponent(lbNome)
                            .addComponent(lbDesc1)
                            .addComponent(lbNome1)
                            .addComponent(lbNome2)
                            .addComponent(lbDesc2)
                            .addComponent(lbDesc))
                        .addGap(194, 194, 194)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(result3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(remove3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(remove2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(remove1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remove1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(lbDesc)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNome1)
                                .addGap(18, 18, 18)
                                .addComponent(lbDesc1))
                            .addComponent(lbImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbNome2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbDesc2))
                                    .addComponent(remove2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbNome3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbDesc3))
                                    .addComponent(remove3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(492, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 710, 480));

        jButtonOrder.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOrder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrder.setText("Enviar Pedido");
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/cardapio/imagens/background-main.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        result.getText();
        contador++;
        result.setText(""+contador);
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        result.getText();
        contador--;
        result.setText(""+contador);
    }//GEN-LAST:event_removeActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        result1.getText();
        contador1++;
        result1.setText(""+contador1);
    }//GEN-LAST:event_add1ActionPerformed

    private void remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove1ActionPerformed
        result1.getText();
        contador1--;
        result1.setText(""+contador1);
    }//GEN-LAST:event_remove1ActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        result2.getText();
        contador2++;
        result2.setText(""+contador2);
    }//GEN-LAST:event_add2ActionPerformed

    private void remove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove2ActionPerformed
        result2.getText();
        contador2--;
        result2.setText(""+contador2);
    }//GEN-LAST:event_remove2ActionPerformed

    private void remove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove3ActionPerformed
        result3.getText();
        contador3--;
        result3.setText(""+contador3);
    }//GEN-LAST:event_remove3ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        result3.getText();
        contador3++;
        result3.setText(""+contador3);
    }//GEN-LAST:event_add3ActionPerformed

    private void jButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderActionPerformed
        jButtonOrder.setToolTipText("Entrar.");
        Order obj = new Order();
        obj.setVisible(true);
    }//GEN-LAST:event_jButtonOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton jButtonOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbDesc1;
    private javax.swing.JLabel lbDesc2;
    private javax.swing.JLabel lbDesc3;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbImagem1;
    private javax.swing.JLabel lbImagem2;
    private javax.swing.JLabel lbImagem3;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbNome3;
    private javax.swing.JButton remove;
    private javax.swing.JButton remove1;
    private javax.swing.JButton remove2;
    private javax.swing.JButton remove3;
    private javax.swing.JLabel result;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result2;
    private javax.swing.JLabel result3;
    // End of variables declaration//GEN-END:variables

}
