/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author Laboratorio
 */
public class AddFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form AddFuncionario
     */
    public AddFuncionario() {
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

        DivAddFuncionario = new javax.swing.JPanel();
        Foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        DivBotoesAddFuncionario = new javax.swing.JPanel();
        soutCpf = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        soutNome1 = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        soutEmail = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        soutSenhaAcesso = new javax.swing.JLabel();
        inputSenhaAcesso = new javax.swing.JTextField();
        soutUf = new javax.swing.JLabel();
        soutSenhaAcesso1 = new javax.swing.JLabel();
        soutBairro = new javax.swing.JLabel();
        soutEndereco = new javax.swing.JLabel();
        soutCidade1 = new javax.swing.JLabel();
        soutNumero = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        inputUf = new javax.swing.JTextField();
        inputCidade = new javax.swing.JTextField();
        inputBairro = new javax.swing.JTextField();
        inputEndereco1 = new javax.swing.JTextField();
        inputBairro1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionário");
        setMaximumSize(new java.awt.Dimension(1012, 800));
        setMinimumSize(new java.awt.Dimension(700, 680));
        setPreferredSize(new java.awt.Dimension(800, 700));

        DivAddFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        Foother.setBackground(new java.awt.Color(40, 203, 58));
        Foother.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        MyStock.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        MyStock.setText("MyStock ");

        Todos.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        Todos.setText("2024 Todos os direitos reservados");

        c.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        c.setText("©");

        javax.swing.GroupLayout FootherLayout = new javax.swing.GroupLayout(Foother);
        Foother.setLayout(FootherLayout);
        FootherLayout.setHorizontalGroup(
            FootherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FootherLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(MyStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Todos)
                .addContainerGap(526, Short.MAX_VALUE))
        );
        FootherLayout.setVerticalGroup(
            FootherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FootherLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(FootherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Todos)
                    .addComponent(c)
                    .addComponent(MyStock))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(40, 203, 58));
        Header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_dark-removebg-preview 2.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        DivBotoesAddFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        DivBotoesAddFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        soutCpf.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutCpf.setText("CPF:");

        inputNome.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        soutNome1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNome1.setText("Nome do usuário:");

        inputCpf.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfActionPerformed(evt);
            }
        });

        soutEmail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEmail.setText("E-mail:");

        inputEmail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        soutSenhaAcesso.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutSenhaAcesso.setText("Senha de acesso:");

        inputSenhaAcesso.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputSenhaAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaAcessoActionPerformed(evt);
            }
        });

        soutUf.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutUf.setText("UF:");

        soutSenhaAcesso1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutSenhaAcesso1.setText("Telefone:");

        soutBairro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutBairro.setText("Bairro:");

        soutEndereco.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEndereco.setText("Endereço:");

        soutCidade1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutCidade1.setText("Cidade:");

        soutNumero.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNumero.setText("Número:");

        inputTelefone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });

        inputUf.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUfActionPerformed(evt);
            }
        });

        inputCidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCidadeActionPerformed(evt);
            }
        });

        inputBairro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBairroActionPerformed(evt);
            }
        });

        inputEndereco1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEndereco1ActionPerformed(evt);
            }
        });

        inputBairro1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBairro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivBotoesAddFuncionarioLayout = new javax.swing.GroupLayout(DivBotoesAddFuncionario);
        DivBotoesAddFuncionario.setLayout(DivBotoesAddFuncionarioLayout);
        DivBotoesAddFuncionarioLayout.setHorizontalGroup(
            DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesAddFuncionarioLayout.createSequentialGroup()
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DivBotoesAddFuncionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(soutNumero)
                        .addGap(18, 18, 18)
                        .addComponent(inputBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddFuncionarioLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddFuncionarioLayout.createSequentialGroup()
                                    .addComponent(soutCpf)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddFuncionarioLayout.createSequentialGroup()
                                    .addComponent(soutEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(DivBotoesAddFuncionarioLayout.createSequentialGroup()
                            .addGap(0, 120, Short.MAX_VALUE)
                            .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DivBotoesAddFuncionarioLayout.createSequentialGroup()
                                    .addComponent(soutNome1)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddFuncionarioLayout.createSequentialGroup()
                                    .addComponent(soutSenhaAcesso)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputSenhaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddFuncionarioLayout.createSequentialGroup()
                                    .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(soutCidade1)
                                        .addComponent(soutSenhaAcesso1)
                                        .addComponent(soutUf)
                                        .addComponent(soutEndereco)
                                        .addComponent(soutBairro))
                                    .addGap(18, 18, 18)
                                    .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                            .addComponent(inputUf)
                                            .addComponent(inputCidade)
                                            .addComponent(inputEndereco1))))))))
                .addGap(0, 120, Short.MAX_VALUE))
        );
        DivBotoesAddFuncionarioLayout.setVerticalGroup(
            DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesAddFuncionarioLayout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutNome1))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutCpf))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutEmail))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSenhaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutSenhaAcesso))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutSenhaAcesso1))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutUf))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutCidade1)
                    .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutEndereco))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutBairro))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutNumero))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DivAddFuncionarioLayout = new javax.swing.GroupLayout(DivAddFuncionario);
        DivAddFuncionario.setLayout(DivAddFuncionarioLayout);
        DivAddFuncionarioLayout.setHorizontalGroup(
            DivAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivAddFuncionarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DivBotoesAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DivAddFuncionarioLayout.setVerticalGroup(
            DivAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivAddFuncionarioLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(DivBotoesAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(Foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivAddFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivAddFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputSenhaAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaAcessoActionPerformed

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneActionPerformed

    private void inputUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUfActionPerformed

    private void inputCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCidadeActionPerformed

    private void inputBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBairroActionPerformed

    private void inputEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEndereco1ActionPerformed

    private void inputBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBairro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBairro1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DivAddFuncionario;
    private javax.swing.JPanel DivBotoesAddFuncionario;
    private javax.swing.JPanel Foother;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JLabel c;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JTextField inputBairro1;
    private javax.swing.JTextField inputCidade;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputEndereco1;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputSenhaAcesso;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JTextField inputUf;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel soutBairro;
    private javax.swing.JLabel soutCidade1;
    private javax.swing.JLabel soutCpf;
    private javax.swing.JLabel soutEmail;
    private javax.swing.JLabel soutEndereco;
    private javax.swing.JLabel soutNome1;
    private javax.swing.JLabel soutNumero;
    private javax.swing.JLabel soutSenhaAcesso;
    private javax.swing.JLabel soutSenhaAcesso1;
    private javax.swing.JLabel soutUf;
    // End of variables declaration//GEN-END:variables
}
