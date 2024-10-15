/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEWS;

import br.com.DAO.ClientsDAO;
import br.com.DTO.ClientDTO;

/**
 *
 * @author aluno.saolucas
 */
public class TCadasClient extends javax.swing.JInternalFrame {

    /**
     * Creates new form TCadasClient
     */
    public TCadasClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmailCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnExcCli = new javax.swing.JButton();
        btnEditCli = new javax.swing.JButton();
        btnPesqCli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadasCli = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Cliente");
        setVisible(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 520));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("Nome");

        txtNomeCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Endereço");

        txtEndCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("Telefone");

        txtTelCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Email");

        txtEmailCli.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setForeground(new java.awt.Color(153, 51, 255));
        jLabel6.setText("CPF/CNPJ");

        txtRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(153, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnExcCli.setBackground(new java.awt.Color(255, 255, 255));
        btnExcCli.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcCli.setForeground(new java.awt.Color(153, 51, 255));
        btnExcCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apaga.png"))); // NOI18N
        btnExcCli.setText("Excluir");
        btnExcCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        btnExcCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcCliActionPerformed(evt);
            }
        });

        btnEditCli.setBackground(new java.awt.Color(255, 255, 255));
        btnEditCli.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditCli.setForeground(new java.awt.Color(153, 51, 255));
        btnEditCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edita.png"))); // NOI18N
        btnEditCli.setText("Editar");
        btnEditCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnEditCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCliActionPerformed(evt);
            }
        });

        btnPesqCli.setBackground(new java.awt.Color(255, 255, 255));
        btnPesqCli.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnPesqCli.setForeground(new java.awt.Color(153, 51, 255));
        btnPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pesquisa.png"))); // NOI18N
        btnPesqCli.setText("Pesquisar");
        btnPesqCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnPesqCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCliActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");

        txtIdCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(153, 51, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesqCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCli))
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnPesqCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcCli)
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Clientes");

        btnCadasCli.setBackground(new java.awt.Color(255, 255, 255));
        btnCadasCli.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadasCli.setForeground(new java.awt.Color(153, 51, 255));
        btnCadasCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adiciona.png"))); // NOI18N
        btnCadasCli.setText("Cadastrar");
        btnCadasCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        btnCadasCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadasCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadasCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnCadasCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadasCli, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(txtEmailCli, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelCli, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndCli, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadasCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadasCliActionPerformed
        String nome_cliente = txtNomeCli.getText();
        String endereco = txtEndCli.getText();
        String telefone = txtTelCli.getText();
        String email_cliente = txtEmailCli.getText();
        String cpf_cpnj = txtRegistro.getText();
       
       
        ClientDTO CDTO = new ClientDTO();
        CDTO.setNome_cliente(nome_cliente);
        CDTO.setEndereco(endereco);
        CDTO.setTelefone(telefone);
        CDTO.setEmail_cliente(email_cliente);
        CDTO.setCpf_cnpj(cpf_cpnj);
       
        ClientsDAO CDAO = new ClientsDAO();
        CDAO.novoClie(CDTO);
    }//GEN-LAST:event_btnCadasCliActionPerformed

    private void btnExcCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcCliActionPerformed
         String cliente_id = txtIdCli.getText();

        ClientDTO objClientDTO = new ClientDTO();
        objClientDTO.setCliente_id(Integer.parseInt(cliente_id));

        ClientsDAO objClientDAO = new ClientsDAO();
        objClientDAO.ApagaCli(objClientDTO);
    }//GEN-LAST:event_btnExcCliActionPerformed

    private void btnEditCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCliActionPerformed
        int cliente_id = Integer.parseInt(txtIdCli.getText());
        String nome_cliente = txtNomeCli.getText();
        String endereco = txtEndCli.getText();
        String telefone = txtTelCli.getText();
        String email_cliente = txtEmailCli.getText();
        String cpf_cpnj = txtRegistro.getText();
       
       
        ClientDTO CDTO = new ClientDTO();
        CDTO.setCliente_id(cliente_id);
        CDTO.setNome_cliente(nome_cliente);
        CDTO.setEndereco(endereco);
        CDTO.setTelefone(telefone);
        CDTO.setEmail_cliente(email_cliente);
        CDTO.setCpf_cnpj(cpf_cpnj);
       
        ClientsDAO CDAO = new ClientsDAO();
        CDAO.EditarCli(CDTO);
    }//GEN-LAST:event_btnEditCliActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ClientsDAO CDAO = new ClientsDAO();
        CDAO.LimpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCliActionPerformed
        int cliente_id = Integer.parseInt(txtIdCli.getText());
        String nome_cliente = txtNomeCli.getText();
        String endereco = txtEndCli.getText();
        String telefone = txtTelCli.getText();
        String email_cliente = txtEmailCli.getText();
       
        ClientDTO CDTO = new ClientDTO();
        CDTO.setCliente_id(cliente_id);
        CDTO.setNome_cliente(nome_cliente );
        CDTO.setEndereco(endereco);
        CDTO.setTelefone(telefone);
        CDTO.setEmail_cliente(email_cliente);
       
        ClientsDAO CDAO = new ClientsDAO();
        CDAO.ProcuraCli(CDTO);  
    }//GEN-LAST:event_btnPesqCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadasCli;
    private javax.swing.JButton btnEditCli;
    private javax.swing.JButton btnExcCli;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txtEmailCli;
    public static javax.swing.JTextField txtEndCli;
    public static javax.swing.JTextField txtIdCli;
    public static javax.swing.JTextField txtNomeCli;
    public static javax.swing.JTextField txtRegistro;
    public static javax.swing.JTextField txtTelCli;
    // End of variables declaration//GEN-END:variables
}
