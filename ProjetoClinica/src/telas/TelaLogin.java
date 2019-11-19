/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Database.DatabaseConnection;
import java.sql.*;

/**
 *
 * @author leticia.magalhaes
 */
public class TelaLogin extends javax.swing.JFrame {
    
    DatabaseConnection conecta = new DatabaseConnection();
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtLogin3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtSenha3 = new javax.swing.JPasswordField();
        jButtonEntrar3 = new javax.swing.JButton();
        txtLembrarUsuario3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/HeartClin.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 10, 120, 130);

        jPanel5.setBackground(new java.awt.Color(241, 191, 191));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/doctor.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nurse.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Betty Lavea", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(202, 104, 133));
        jLabel22.setText("Usuário:");

        txtLogin3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogin3txtLoginActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lock.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Betty Lavea", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(202, 104, 133));
        jLabel24.setText("Senha:");

        txtSenha3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSenha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha3txtSenhaActionPerformed(evt);
            }
        });

        jButtonEntrar3.setBackground(new java.awt.Color(202, 104, 133));
        jButtonEntrar3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEntrar3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar3.setText("Entrar");
        jButtonEntrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrar3jButtonEntrarActionPerformed(evt);
            }
        });

        txtLembrarUsuario3.setFont(new java.awt.Font("Betty Lavea", 1, 14)); // NOI18N
        txtLembrarUsuario3.setForeground(new java.awt.Color(202, 104, 133));
        txtLembrarUsuario3.setText("Lembrar Usuário");
        txtLembrarUsuario3.setBorder(null);
        txtLembrarUsuario3.setBorderPaintedFlat(true);
        txtLembrarUsuario3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLembrarUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLembrarUsuario3txtLembrarUsuarioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(202, 104, 133));
        jButton1.setText("Cadastre-se");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButtonEntrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addComponent(txtLogin3)
                    .addComponent(txtSenha3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtLembrarUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(txtLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonEntrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLembrarUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(30, 50, 340, 400);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AreaFundo.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 500);

        setSize(new java.awt.Dimension(406, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLogin3txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogin3txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogin3txtLoginActionPerformed

    private void txtSenha3txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha3txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha3txtSenhaActionPerformed

    private void jButtonEntrar3jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrar3jButtonEntrarActionPerformed
    HeartClin heartClin = new HeartClin();
    heartClin.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButtonEntrar3jButtonEntrarActionPerformed

    private void txtLembrarUsuario3txtLembrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLembrarUsuario3txtLembrarUsuarioActionPerformed

    }//GEN-LAST:event_txtLembrarUsuario3txtLembrarUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Cadastros cadastros = new Cadastros();
       cadastros.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DoLogin(){
        
        String query =  "SELECT * FROM USER WHERE nome = " + txtLogin3.getText() + " senha= " + txtSenha3.getPassword();
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Boolean hasUser = false;

            Statement stmt = databaseConnection.Conexao().createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(query);
            while (rs.next()){
                hasUser = true;
            }
            databaseConnection.Conexao().close();
        } catch (Exception ex){
            System.err.println("Got an exception! ");
            System.err.println(ex.getMessage());
        }
    }
    
   /* private void DoSignIn(){
        String query =  "INSERT INTO USER VALUES nome= " + jTextField2.getText() + " senha= " + jPasswordField3.getPassword();
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Statement stmt = databaseConnection.processRequest().createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(query);
            while (rs.next()){
                // O que deve acontecer ao adicionar alguem.
            }
            databaseConnection.processRequest().close();
        } catch (Exception ex){
            System.err.println("Got an exception! ");
            System.err.println(ex.getMessage());
        }
    }*/
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEntrar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox txtLembrarUsuario3;
    private javax.swing.JTextField txtLogin3;
    private javax.swing.JPasswordField txtSenha3;
    // End of variables declaration//GEN-END:variables

}
