/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import ModeloClasse.Administrador;
import ModeloClasse.Funcionario;
import Repositorio.Repositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author Jason
 */
public class Login extends javax.swing.JFrame {
    private Funcionario f;
    
    /**
     * Creates new form Login
     */
    public Login() {
        Repositorio.init();
        initComponents();
        
    }
    private boolean validarInput(String email, String senha) { 
        for (Funcionario funcionario: Repositorio.funcionario) {
            if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        divLogin = new javax.swing.JPanel();
        divBotoes = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        soutEmail = new javax.swing.JLabel();
        soutSenha = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        checkAdm = new javax.swing.JCheckBox();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(1012, 800));
        setMinimumSize(new java.awt.Dimension(700, 680));
        setPreferredSize(new java.awt.Dimension(800, 700));

        divLogin.setBackground(new java.awt.Color(255, 255, 255));
        divLogin.setMaximumSize(new java.awt.Dimension(0, 0));
        divLogin.setPreferredSize(new java.awt.Dimension(800, 700));

        divBotoes.setBackground(new java.awt.Color(255, 255, 255));
        divBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        soutEmail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEmail.setText("E-mail:");

        soutSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutSenha.setText("Senha:");

        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });

        botaoLogin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoLogin.setText("Login");
        botaoLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        checkAdm.setText("Administrador");
        checkAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divBotoesLayout = new javax.swing.GroupLayout(divBotoes);
        divBotoes.setLayout(divBotoesLayout);
        divBotoesLayout.setHorizontalGroup(
            divBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divBotoesLayout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addGroup(divBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(soutEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soutSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(divBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(inputSenha))
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divBotoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoLogin)
                .addGap(188, 188, 188))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divBotoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkAdm)
                .addGap(173, 173, 173))
        );
        divBotoesLayout.setVerticalGroup(
            divBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divBotoesLayout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(divBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soutEmail)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(divBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutSenha)
                    .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoLogin)
                .addGap(18, 18, 18)
                .addComponent(checkAdm)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(40, 203, 58));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_dark-removebg-preview 2.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        foother.setBackground(new java.awt.Color(40, 203, 58));
        foother.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        MyStock.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        MyStock.setText("MyStock ");

        Todos.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        Todos.setText("2024 Todos os direitos reservados");

        c.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        c.setText("©");

        javax.swing.GroupLayout footherLayout = new javax.swing.GroupLayout(foother);
        foother.setLayout(footherLayout);
        footherLayout.setHorizontalGroup(
            footherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(MyStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Todos)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        footherLayout.setVerticalGroup(
            footherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footherLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(footherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Todos)
                    .addComponent(c)
                    .addComponent(MyStock))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout divLoginLayout = new javax.swing.GroupLayout(divLogin);
        divLogin.setLayout(divLoginLayout);
        divLoginLayout.setHorizontalGroup(
            divLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(foother, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divLoginLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(divBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );
        divLoginLayout.setVerticalGroup(
            divLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divLoginLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(divBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(divLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(divLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
            String email = inputEmail.getText();
            String senha = new String(inputSenha.getPassword());
           
        if (!email.isEmpty() && !senha.isEmpty()) {
            if (Repositorio.administrador.get(0).getEmail().equalsIgnoreCase(email)
                    && Repositorio.administrador.get(0).getSenha().equalsIgnoreCase(senha)
                        && checkAdm.isSelected()) {
                            
                            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
                            new MenuAdm().setVisible(true);
                            this.dispose();
            } else if (validarInput(email, senha) && !checkAdm.isSelected()) {
                 JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
                 new MenuAdm().setVisible(true);
                 this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "O email e senha digita não correspondem a um usuário cadastrado!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "O email e senha não podem estar vazios!");
        }
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void checkAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdmActionPerformed
        
    }//GEN-LAST:event_checkAdmActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JLabel c;
    private javax.swing.JCheckBox checkAdm;
    private javax.swing.JPanel divBotoes;
    private javax.swing.JPanel divLogin;
    private javax.swing.JPanel foother;
    private javax.swing.JPanel header;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel soutEmail;
    private javax.swing.JLabel soutSenha;
    // End of variables declaration//GEN-END:variables
}
