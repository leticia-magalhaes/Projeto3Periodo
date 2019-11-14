/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Database.DatabaseConnection;
import Utils.ConsultaCep;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.security.util.Debug;


    

public class Pacientes extends javax.swing.JFrame {
    
    /**
     * Creates new form Pacientes
     */
    public Pacientes() {
        initComponents();
        
        /*listarCadastros();*/
       
    }
    
    private void mostrarTelas(String nome){
    
    CardLayout card = (CardLayout)PainelPrincipal.getLayout();
    card.show(PainelPrincipal, nome);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        PainelBotoes = new javax.swing.JPanel();
        Nurse = new javax.swing.JLabel();
        Doctor = new javax.swing.JLabel();
        LocalizarPacientes = new javax.swing.JButton();
        NovoPaciente = new javax.swing.JButton();
        PainelPrincipal = new javax.swing.JPanel();
        PainelLocalizarPacientes = new javax.swing.JPanel();
        jPanelPacientes1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        txtProcurar1 = new javax.swing.JLabel();
        txtBusca1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        labelClientes1 = new javax.swing.JLabel();
        btnAlterar1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnBusca = new javax.swing.JButton();
        PainelNovoPaciente = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JTextField();
        txtNomePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar2 = new javax.swing.JButton();
        btnVoltar1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nurse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nurse (1).png"))); // NOI18N

        Doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/doctor (1).png"))); // NOI18N

        LocalizarPacientes.setText("Localizar Pacientes");
        LocalizarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizarPacientesActionPerformed(evt);
            }
        });

        NovoPaciente.setText("Novo Paciente");
        NovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelBotoesLayout = new javax.swing.GroupLayout(PainelBotoes);
        PainelBotoes.setLayout(PainelBotoesLayout);
        PainelBotoesLayout.setHorizontalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelBotoesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Nurse, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LocalizarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(NovoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBotoesLayout.setVerticalGroup(
            PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nurse, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LocalizarPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NovoPaciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelPrincipal.setLayout(new java.awt.CardLayout());

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo1.setText("Pacientes");

        txtProcurar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtProcurar1.setText("Procurar:");

        txtBusca1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusca1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusca1KeyReleased(evt);
            }
        });

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabela1);

        labelClientes1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelClientes1.setText("Total de clientes: 0");

        btnAlterar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterar1.setText("Alterar");
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        btnExcluir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnVisualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVisualizar.setText("Visualizar");

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPacientes1Layout = new javax.swing.GroupLayout(jPanelPacientes1);
        jPanelPacientes1.setLayout(jPanelPacientes1Layout);
        jPanelPacientes1Layout.setHorizontalGroup(
            jPanelPacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientes1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelPacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPacientes1Layout.createSequentialGroup()
                                .addComponent(btnVisualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir1))
                            .addComponent(labelClientes1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelPacientes1Layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelPacientes1Layout.createSequentialGroup()
                        .addComponent(txtProcurar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusca1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPacientes1Layout.setVerticalGroup(
            jPanelPacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacientes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo1)
                .addGap(22, 22, 22)
                .addGroup(jPanelPacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurar1)
                    .addComponent(txtBusca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addGroup(jPanelPacientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir1)
                    .addComponent(btnAlterar1)
                    .addComponent(btnVisualizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelLocalizarPacientesLayout = new javax.swing.GroupLayout(PainelLocalizarPacientes);
        PainelLocalizarPacientes.setLayout(PainelLocalizarPacientesLayout);
        PainelLocalizarPacientesLayout.setHorizontalGroup(
            PainelLocalizarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPacientes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelLocalizarPacientesLayout.setVerticalGroup(
            PainelLocalizarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPacientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PainelPrincipal.add(PainelLocalizarPacientes, "PainelLocalizarPacientes");

        titulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo2.setText("Pacientes");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("CEP:");

        txtCEP.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCEPInputMethodTextChanged(evt);
            }
        });
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });
        txtCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCEPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCEPKeyReleased(evt);
            }
        });

        jLabel11.setText("Logradouro:");

        jLabel12.setText("Número:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        jLabel13.setText("Complemento:");

        jLabel14.setText("Bairro:");

        jLabel15.setText("Estado:");

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jLabel16.setText("Cidade:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogradouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Data Cadastro");

        jLabel2.setText("Nome do Paciente:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Nascimento:");

        jLabel5.setText("Telefone:");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel7.setText("CPF:");

        jLabel8.setText("RG:");

        jLabel9.setText("Convênio:");

        jLabel17.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePaciente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConvenio))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNovoPacienteLayout = new javax.swing.GroupLayout(PainelNovoPaciente);
        PainelNovoPaciente.setLayout(PainelNovoPacienteLayout);
        PainelNovoPacienteLayout.setHorizontalGroup(
            PainelNovoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNovoPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelNovoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelNovoPacienteLayout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNovoPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar2)))
                .addContainerGap())
        );
        PainelNovoPacienteLayout.setVerticalGroup(
            PainelNovoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNovoPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(PainelNovoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar2))
                .addContainerGap())
        );

        PainelPrincipal.add(PainelNovoPaciente, "PainelNovoPaciente");

        btnVoltar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar1.setText("Voltar");
        btnVoltar1.setMaximumSize(new java.awt.Dimension(97, 25));
        btnVoltar1.setMinimumSize(new java.awt.Dimension(97, 25));
        btnVoltar1.setPreferredSize(new java.awt.Dimension(97, 25));
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocalizarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizarPacientesActionPerformed
        mostrarTelas("PainelLocalizarPacientes");
    }//GEN-LAST:event_LocalizarPacientesActionPerformed

    private void NovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoPacienteActionPerformed
        mostrarTelas("PainelNovoPaciente");
    }//GEN-LAST:event_NovoPacienteActionPerformed

    private void txtBusca1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusca1KeyPressed

    }//GEN-LAST:event_txtBusca1KeyPressed

    private void txtBusca1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusca1KeyReleased

         
    }//GEN-LAST:event_txtBusca1KeyReleased

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
 
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed

    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
    
        if (txtDataCadastro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Data do Cadastro!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtNomePaciente.requestFocus();
            return;
        }
        
        if (txtDataNascimento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Data de Nascimento!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtTelefone.requestFocus();
            return;
        }
        
        if (txtNomePaciente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Nome do Paciente!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtCPF.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtRG.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o RG!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtTelefone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Telefone!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtConvenio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Convenio!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtCEP.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CEP!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtLogradouro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Logradouro!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtNumero.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Numero!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtBairro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Bairro!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtCidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Cidade!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }
        
        if (txtEstado.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Estado!", "Campo em branco", JOptionPane.YES_NO_OPTION);
            txtEmail.requestFocus();
            return;
        }

        try{
            DatabaseConnection databaseConnection = new DatabaseConnection();

            String query = "INSERT INTO PACIENTES (ID_PACIENTE, DATA_CADASTRO, NASCIMENTO, NOME_PACIENTE, CPF, RG, TELEFONE, SEXO, EMAIL, CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO ) VALUES(ID.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            Connection con = databaseConnection.Conexao();
            PreparedStatement pst = con.prepareStatement(query);
            
            int count = 0;
            pst.setString(++count, txtDataCadastro.getText());
            pst.setString(++count, txtDataNascimento.getText());
            pst.setString(++count, txtNomePaciente.getText());
            pst.setString(++count, txtCPF.getText());
            pst.setString(++count, txtRG.getText());
            pst.setString(++count, txtTelefone.getText());
            pst.setString(++count, txtSexo.getText());
            pst.setString(++count, txtEmail.getText());
            pst.setString(++count, txtCEP.getText());
            pst.setString(++count, txtLogradouro.getText());
            pst.setString(++count, txtNumero.getText());
            pst.setString(++count, txtComplemento.getText());
            pst.setString(++count, txtBairro.getText());
            pst.setString(++count, txtCidade.getText());
            pst.setString(++count, txtEstado.getText());
            
            pst.execute();
            
            pst.close();
            JOptionPane.showMessageDialog(null, "Cadastro Salvo!"); 
            
            txtDataCadastro.setText(null);
            txtDataNascimento.setText(null);
            txtNomePaciente.setText(null);
            txtCPF.setText(null);
            txtRG.setText(null);
            txtTelefone.setText(null);
            txtSexo.setText(null);
            txtEmail.setText(null);
            txtCEP.setText(null);
            txtLogradouro.setText(null);
            txtNumero.setText(null);
            txtComplemento.setText(null);
            txtBairro.setText(null);
            txtCidade.setText(null);       
            txtEstado.setText(null);
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
       
   
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        HeartClin heartClin = new HeartClin();
        heartClin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void txtCEPInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCEPInputMethodTextChanged
        
    }//GEN-LAST:event_txtCEPInputMethodTextChanged

    private void txtCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyPressed
        
    }//GEN-LAST:event_txtCEPKeyPressed

    private void txtCEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEPKeyReleased
        if(txtCEP.getText().length() == 8){
            ConsultaCep consulta = new ConsultaCep();
            consulta.buscarCep(txtCEP.getText());
            txtLogradouro.setText(consulta.Logradouro);
            txtCidade.setText(consulta.Localidade);
            txtBairro.setText(consulta.Bairro);
            txtEstado.setText(consulta.Uf);
        } else {
            txtLogradouro.setText("");
            txtCidade.setText("");
            txtBairro.setText("");
            txtEstado.setText("");
        }
    }//GEN-LAST:event_txtCEPKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
            txtDataCadastro.setText(null);
            txtDataNascimento.setText(null);
            txtNomePaciente.setText(null);
            txtCPF.setText(null);
            txtRG.setText(null);
            txtTelefone.setText(null);
            txtSexo.setText(null);
            txtEmail.setText(null);
            txtConvenio.setText(null);
            txtCEP.setText(null);
            txtLogradouro.setText(null);
            txtNumero.setText(null);
            txtComplemento.setText(null);
            txtBairro.setText(null);
            txtCidade.setText(null);       
            txtEstado.setText(null);
            
            JOptionPane.showMessageDialog(null, "Cadastro Cancelado!");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Doctor;
    private javax.swing.JButton LocalizarPacientes;
    private javax.swing.JButton NovoPaciente;
    private javax.swing.JLabel Nurse;
    private javax.swing.JPanel PainelBotoes;
    private javax.swing.JPanel PainelLocalizarPacientes;
    private javax.swing.JPanel PainelNovoPaciente;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelPacientes1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelClientes1;
    private javax.swing.JTable tabela1;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca1;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtConvenio;
    private javax.swing.JTextField txtDataCadastro;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIDPaciente;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JLabel txtProcurar1;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
