/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.cardapio.UI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import projeto.cardapio.Repositorio;
import projeto.cardapio.Funcao;

public class JFrameListFuncao extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    
    public JFrameListFuncao() {
        initComponents();
        setLocationRelativeTo(null);
        carregarFuncoes();
    }
    
    public void carregarFuncoes(){
        if(model != null)resetTable();
        Repositorio db = new Repositorio();
        Funcao[] funcoes = db.obterListaDeFuncoes();
        
        String[] colunas = new String[]{"ID", "Nome"};
        String[][] dados = new String[funcoes.length][colunas.length];
        for(int i=0; i<funcoes.length; i++){
            dados[i] = new String[]{""+funcoes[i].getID()+"", funcoes[i].getNome()};
        }
        this.model = new DefaultTableModel(dados,colunas);
        tbFuncao.setModel(this.model);
    }

    public void resetTable(){
        this.model.setRowCount(0);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncao = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0 ? false : true;
            }

            @Override
            public void setValueAt(Object aValue, int row, int col) {
                int id = Integer.parseInt(this.getValueAt(row, col -1).toString());
                String nome = (String) aValue;
                Repositorio db = new Repositorio();
                db.alterarFuncao(id, nome);
                JFrameListFuncao frame = (JFrameListFuncao)SwingUtilities.getRoot(this);
                frame.carregarFuncoes();
            }
        };
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Funções");
        setResizable(false);

        tbFuncao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbFuncao);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        JFrameFuncao jff = new JFrameFuncao();
        jff.setVisible(true);
       jff.addWindowListener(new FuncaoWindowAdapter(this));
        btnAdicionar.setEnabled(false);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int row = tbFuncao.getSelectedRow();
        int ID = Integer.parseInt(tbFuncao.getValueAt(row, 0).toString());
        Repositorio db = new Repositorio();
        db.removerFuncao(ID);
        this.carregarFuncoes();
    }//GEN-LAST:event_btnRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameListFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameListFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameListFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameListFuncao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameListFuncao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFuncao;
    // End of variables declaration//GEN-END:variables
    
        public class FuncaoWindowAdapter extends WindowAdapter{
        
        private final JFrameListFuncao parent;
        
        public FuncaoWindowAdapter(JFrameListFuncao parent){
            super();
            this.parent = parent;
        }
        
        @Override
        public void windowClosing(WindowEvent e) {
            parent.carregarFuncoes();
            parent.btnAdicionar.setEnabled(true);
        }
        
    }
    
}
