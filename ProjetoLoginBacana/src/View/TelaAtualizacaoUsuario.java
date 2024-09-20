/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroUsuariosController;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TelaAtualizacaoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroNovoUsuario
     */
//Vari�veis oriundas da tela de cadastro;
//    String id_user;
//    String nomeUser;
//    String email;
//    String login;
//    String perfil;
    public TelaAtualizacaoUsuario() {
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

        pnlBase = new javax.swing.JPanel();
        pnlDireita = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlEsquerda = new javax.swing.JPanel();
        pnlFooter = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAtualizacao = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        pnlDadosUsuarios = new javax.swing.JPanel();
        lblIDUsuario = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        lblNomeCompleto = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSelecionarTipoUsuario = new javax.swing.JLabel();
        pnlTipoDeUsuario = new javax.swing.JPanel();
        radioBtnAdmin = new javax.swing.JRadioButton();
        radioBtnUser = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBase.setLayout(new java.awt.BorderLayout());

        pnlDireita.setPreferredSize(new java.awt.Dimension(15, 125));

        javax.swing.GroupLayout pnlDireitaLayout = new javax.swing.GroupLayout(pnlDireita);
        pnlDireita.setLayout(pnlDireitaLayout);
        pnlDireitaLayout.setHorizontalGroup(
            pnlDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlDireitaLayout.setVerticalGroup(
            pnlDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pnlBase.add(pnlDireita, java.awt.BorderLayout.LINE_END);

        pnlHeader.setPreferredSize(new java.awt.Dimension(738, 60));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("jLabel2");

        javax.swing.GroupLayout pnLogoLayout = new javax.swing.GroupLayout(pnLogo);
        pnLogo.setLayout(pnLogoLayout);
        pnLogoLayout.setHorizontalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnLogoLayout.setVerticalGroup(
            pnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitulo.setBackground(new java.awt.Color(255, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Atualizar dados de Usu�rio");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBase.add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlEsquerda.setPreferredSize(new java.awt.Dimension(15, 125));

        javax.swing.GroupLayout pnlEsquerdaLayout = new javax.swing.GroupLayout(pnlEsquerda);
        pnlEsquerda.setLayout(pnlEsquerdaLayout);
        pnlEsquerdaLayout.setHorizontalGroup(
            pnlEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlEsquerdaLayout.setVerticalGroup(
            pnlEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pnlBase.add(pnlEsquerda, java.awt.BorderLayout.LINE_START);

        pnlFooter.setPreferredSize(new java.awt.Dimension(738, 40));

        pnlBotoes.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar);

        btnAtualizacao.setBackground(new java.awt.Color(0, 102, 102));
        btnAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizacao.setText("Atualizar");
        btnAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizacaoActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnAtualizacao);

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFooterLayout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnlBase.add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlCentral.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usu�rio"));

        pnlDadosUsuarios.setLayout(new java.awt.GridLayout(10, 1, 5, 5));

        lblIDUsuario.setText("ID Usu�rio");
        pnlDadosUsuarios.add(lblIDUsuario);
        pnlDadosUsuarios.add(txtIDUsuario);

        lblNomeCompleto.setText("Nome Completo:");
        lblNomeCompleto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuarios.add(lblNomeCompleto);
        pnlDadosUsuarios.add(txtNomeCompleto);

        lblEmail.setText("Email:");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuarios.add(lblEmail);
        pnlDadosUsuarios.add(txtEmail);

        lblLogin.setText("Login:");
        lblLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuarios.add(lblLogin);
        pnlDadosUsuarios.add(txtLogin);

        lblSelecionarTipoUsuario.setText("Selecionar o perfil de Usu�rio:");
        lblSelecionarTipoUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuarios.add(lblSelecionarTipoUsuario);

        pnlTipoDeUsuario.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        radioBtnAdmin.setText("ADMIN");
        radioBtnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radioBtnAdmin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioBtnAdminItemStateChanged(evt);
            }
        });
        pnlTipoDeUsuario.add(radioBtnAdmin);

        radioBtnUser.setText("USER");
        radioBtnUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radioBtnUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioBtnUserItemStateChanged(evt);
            }
        });
        pnlTipoDeUsuario.add(radioBtnUser);

        pnlDadosUsuarios.add(pnlTipoDeUsuario);

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pnlBase.add(pnlCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNomeCompleto.setText(null);
        txtEmail.setText(null);
        txtLogin.setText(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizacaoActionPerformed

        //recuperar os dados modificados nos campos texto
        String id_user = txtIDUsuario.getText();
        String username = txtNomeCompleto.getText();
        String email = txtEmail.getText();
        String login = txtLogin.getText();
        String perfil = null;
        if (radioBtnAdmin.isSelected()) {
            perfil = "admin";
        } else {
            perfil = "colaborador";
        }   
        
        CadastroUsuariosController oper = new CadastroUsuariosController();
        oper.atualizarUsuarioController(id_user, username, email, login, perfil);
        
        txtIDUsuario.setText(null);
        txtNomeCompleto.setText(null);
        txtEmail.setText(null);
        txtLogin.setText(null);
        
        
        this.dispose();
    }//GEN-LAST:event_btnAtualizacaoActionPerformed

    private void radioBtnAdminItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioBtnAdminItemStateChanged
        radioBtnUser.setSelected(false);
    }//GEN-LAST:event_radioBtnAdminItemStateChanged

    private void radioBtnUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioBtnUserItemStateChanged
        radioBtnAdmin.setSelected(false);
    }//GEN-LAST:event_radioBtnUserItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizacaoUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizacao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblSelecionarTipoUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnLogo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlDadosUsuarios;
    private javax.swing.JPanel pnlDireita;
    private javax.swing.JPanel pnlEsquerda;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlTipoDeUsuario;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton radioBtnAdmin;
    private javax.swing.JRadioButton radioBtnUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeCompleto;
    // End of variables declaration//GEN-END:variables

    public void atualizaCamposTela(String id_user, String nomeUser, String email, String login, String perfil) {

        txtIDUsuario.setText(id_user);
        txtNomeCompleto.setText(nomeUser);
        txtEmail.setText(email);
        txtLogin.setText(login);

        if (perfil.equals("admin")) {
            radioBtnAdmin.setSelected(true);
            radioBtnUser.setSelected(false);
        } else {
            radioBtnAdmin.setSelected(false);
            radioBtnUser.setSelected(true);
        }
    }
}
