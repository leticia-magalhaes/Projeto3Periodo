/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Database.DatabaseConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Letícia Magalhães
 */
public class NovoAgendamento extends javax.swing.JFrame {
    DatabaseConnection databaseConnection = new DatabaseConnection();

    /**
     * Creates new form NovoAgendamento
     */
    public NovoAgendamento() {
        initComponents();

        String[] vetorTurno = {"Matutino", "Diurno", "Noturno"};
        txtTurnoAgendamento.setModel(new javax.swing.DefaultComboBoxModel<>(vetorTurno));
        
    }
    
    public void initValues(){
    try {
            connection = databaseConnection.Conexao();
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection con = databaseConnection.Conexao();
            PreparedStatement pst = connection.prepareStatement("SELECT NOME_MEDICO FROM MEDICOS ");
            ResultSet rs = pst.executeQuery();


            ArrayList<String> resultados = new ArrayList<String>();

            while (rs.next()) {
                resultados.add(rs.getString(1));
            }
            
            String[] vetor = new String[resultados.size()];
            
            for (int i = 0; i < resultados.size();i++){
                vetor[i] = resultados.get(i);
            }

            jComboBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(vetor));

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + ex.getCause() + " + Erro ao Buscar Médicos!");
        }
    
    preencherTabelaNovoAgendamento("SELECT ID_PACIENTE, NOME_PACIENTE, CPF, RG, TELEFONE, SEXO FROM PACIENTES ORDER BY ID_PACIENTE ");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        PainelCadastrosMedicos = new javax.swing.JPanel();
        btnSalvarMedico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarPacienteAgendamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnPesquisarPaciente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaNovoAgendamentoScroll = new javax.swing.JScrollPane();
        TabelaNovoAgendamento = new javax.swing.JTable();
        txtTurnoAgendamento = new javax.swing.JComboBox<>();
        btnAtualizarMedico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Motivo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnHeartClinNovoAgendamento = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PainelCadastrosMedicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalvarMedico.setText("Finalizar Agendamento");
        btnSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMedicoActionPerformed(evt);
            }
        });

        jLabel2.setText("Paciente:");

        jLabel8.setText("Turno:");

        btnPesquisarPaciente.setText("Pesquisar");
        btnPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPacienteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Novo Agendamento");

        jLabel25.setText("ID do Paciente:");

        TabelaNovoAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaNovoAgendamentoScroll.setViewportView(TabelaNovoAgendamento);

        jScrollPane1.setViewportView(TabelaNovoAgendamentoScroll);

        txtTurnoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoAgendamentoActionPerformed(evt);
            }
        });

        btnAtualizarMedico.setText("Cancelar Agendamento");
        btnAtualizarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarMedicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Médico:");

        jComboBoxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedicoActionPerformed(evt);
            }
        });

        jLabel3.setText("Data do Agendamento:");

        Motivo.setText("Motivo:");

        btnHeartClinNovoAgendamento.setText("HeartClin");
        btnHeartClinNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeartClinNovoAgendamentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Hora:");

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastrosMedicosLayout = new javax.swing.GroupLayout(PainelCadastrosMedicos);
        PainelCadastrosMedicos.setLayout(PainelCadastrosMedicosLayout);
        PainelCadastrosMedicosLayout.setHorizontalGroup(
            PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1)
                            .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTurnoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                        .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Motivo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtBuscarPacienteAgendamento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)))
                                .addGap(0, 48, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastrosMedicosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastrosMedicosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHeartClinNovoAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        PainelCadastrosMedicosLayout.setVerticalGroup(
            PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTurnoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarPacienteAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPaciente)
                    .addComponent(btnSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(PainelCadastrosMedicosLayout.createSequentialGroup()
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Motivo)
                    .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastrosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarMedico)
                    .addComponent(btnAtualizarMedico)
                    .addComponent(btnHeartClinNovoAgendamento))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrosMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelCadastrosMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(736, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarMedicoActionPerformed
        
    }//GEN-LAST:event_btnAtualizarMedicoActionPerformed

    private void btnSalvarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMedicoActionPerformed
        
    }//GEN-LAST:event_btnSalvarMedicoActionPerformed

    private void btnHeartClinNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeartClinNovoAgendamentoActionPerformed
        HeartClin heartClin = new HeartClin();
        heartClin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHeartClinNovoAgendamentoActionPerformed

    private void txtTurnoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoAgendamentoActionPerformed
       
    }//GEN-LAST:event_txtTurnoAgendamentoActionPerformed
    Connection connection = null;
    private void jComboBoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedicoActionPerformed
     
        
    }//GEN-LAST:event_jComboBoxMedicoActionPerformed

    private void btnPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPacienteActionPerformed
        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();

            String query = "SELECT ID_PACIENTE, NOME_PACIENTE, CPF, RG, TELEFONE, SEXO FROM PACIENTES WHERE NOME_PACIENTE like '%"+txtBuscarPacienteAgendamento.getText()+"%' OR CPF like '%"+txtBuscarPacienteAgendamento.getText()+"%'";

            Connection con = databaseConnection.Conexao();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            TabelaNovoAgendamento.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Busca");
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
       
    }//GEN-LAST:event_btnPesquisarPacienteActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        BigDecimal numero = (BigDecimal) TabelaNovoAgendamento.getModel().getValueAt(TabelaNovoAgendamento.getSelectedRow(), 0);
        txtIDPaciente.setText(numero.toString());
        
        
    }//GEN-LAST:event_btnSelecionarActionPerformed

    public void preencherTabelaNovoAgendamento(String Sql) {
        connection = databaseConnection.Conexao();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection con = databaseConnection.Conexao();
            PreparedStatement pst = connection.prepareStatement(Sql);
            ResultSet rs = pst.executeQuery();

            TabelaNovoAgendamento.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + ex.getCause() + " + Erro ao agendamento!");
        }

    }
    
    
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
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Motivo;
    private javax.swing.JPanel PainelCadastrosMedicos;
    private javax.swing.JTable TabelaNovoAgendamento;
    private javax.swing.JScrollPane TabelaNovoAgendamentoScroll;
    private javax.swing.JButton btnAtualizarMedico;
    private javax.swing.JButton btnHeartClinNovoAgendamento;
    private javax.swing.JButton btnPesquisarPaciente;
    private javax.swing.JButton btnSalvarMedico;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscarPacienteAgendamento;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JComboBox<String> txtTurnoAgendamento;
    // End of variables declaration//GEN-END:variables
}
