/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.cardapio.UI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import projeto.cardapio.Mesa;
import projeto.cardapio.Repositorio;


public class JFrameListMesa extends javax.swing.JFrame {
    
    private DefaultTableModel model;

    public JFrameListMesa() {
        initComponents();
        setLocationRelativeTo(null);
        this.carregarMesas();
        
        this.setCellRender(tbMesas, 0, JTableAlign.LEFT());
        this.setCellRender(tbMesas, 1, JTableAlign.LEFT());
        this.setCellRender(tbMesas, 2, JTableAlign.LEFT());
        this.setCellRender(tbMesas, 3, JTableAlign.LEFT());
        
    
    }
    
      private void setCellRender(javax.swing.JTable table, int columnIndex, DefaultTableCellRenderer renderer){
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(renderer);
    }
    
      private void resetTable(){
        this.model.setRowCount(0);
    }
      
    public void carregarMesas(){
       
        if(this.model != null) resetTable();
        Repositorio db = new Repositorio();
        Mesa[] mesas = db.obterListaDeMesas();                    
        String[] colunas = new String[]{"ID", "Mesa", "Pedido", "Funcionário"};
        String[][] dados = new String[mesas.length][colunas.length];
        for(int i=0; i <  mesas.length; i++){
            projeto.cardapio.Pedido[] pedidos = mesas[i].getPedidos();
            String pedido = "";
            for(projeto.cardapio.Pedido p : pedidos) pedido += p.toString();
            
            dados[i] = new String[]{
                mesas[i].getID() + "", 
                mesas[i].getNumero() + "", 
                pedido != "" ?  pedido : "Não há pedidos",
                mesas[i].getFuncionario() != null ? mesas[i].getFuncionario().getNome() : "Não há funcionário"
            };
                
        this.model = new DefaultTableModel(dados,colunas);
        tbMesas.setModel(this.model);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMesas = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Mesas");
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        tbMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Mesa", "Pedido", "Funcionário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMesas);
        if (tbMesas.getColumnModel().getColumnCount() > 0) {
            tbMesas.getColumnModel().getColumn(0).setResizable(false);
            tbMesas.getColumnModel().getColumn(1).setResizable(false);
            tbMesas.getColumnModel().getColumn(2).setResizable(false);
            tbMesas.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemover)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        JFrameMesa jfm = new JFrameMesa();
        jfm.setVisible(true);
        jfm.addWindowListener(new MesaWindowAdapter(this));
        btnAdicionar.setEnabled(false);
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameListMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameListMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameListMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameListMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameListMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMesas;
    // End of variables declaration//GEN-END:variables
    
    class MesaWindowAdapter extends WindowAdapter{
        
        private final JFrameListMesa parent;

        public MesaWindowAdapter(JFrameListMesa parent) {
            super();
            this.parent = parent;
        }
        
        @Override
        
        public void windowClosing(WindowEvent e) {
            parent.carregarMesas();
            parent.btnAdicionar.setEnabled(true);
        }
    }
    
}
