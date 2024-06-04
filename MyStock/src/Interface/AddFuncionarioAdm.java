/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import ModeloClasse.Funcionario;
import Repositorio.Repositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class AddFuncionarioAdm extends javax.swing.JFrame {
  
    Funcionario funcionario = new Funcionario();
    
    
    /**
     * Creates new form AddFuncionario
     */
    
    public AddFuncionarioAdm() {
        initComponents();
    }

    private void limpar() {
        this.inputEmail.setText("");
        this.inputSenhaAcesso.setText("");
        
        //this.textFieldLogin.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DivAddUsuário = new javax.swing.JPanel();
        Foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        DivBotoesAddUsuário = new javax.swing.JPanel();
        soutCpf = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        soutNome = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        soutEmail = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        soutSenhaAcesso = new javax.swing.JLabel();
        inputSenhaAcesso = new javax.swing.JTextField();
        soutUf = new javax.swing.JLabel();
        soutSenhaAcesso1 = new javax.swing.JLabel();
        soutBairro = new javax.swing.JLabel();
        soutEndereco = new javax.swing.JLabel();
        soutCidade = new javax.swing.JLabel();
        soutNumero = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        inputUf = new javax.swing.JTextField();
        inputCidade = new javax.swing.JTextField();
        inputBairro = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        inputNumero = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionário");
        setMinimumSize(new java.awt.Dimension(700, 875));
        setPreferredSize(new java.awt.Dimension(700, 875));

        DivAddUsuário.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(538, Short.MAX_VALUE))
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

        DivBotoesAddUsuário.setBackground(new java.awt.Color(255, 255, 255));
        DivBotoesAddUsuário.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        soutCpf.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutCpf.setText("CPF:");

        inputNome.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        soutNome.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNome.setText("Nome do usuário:");

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

        soutCidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutCidade.setText("Cidade:");

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

        inputEndereco.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoActionPerformed(evt);
            }
        });

        inputNumero.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setBorder(null);
        botaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoListar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoListar.setText("Listar");
        botaoListar.setBorder(null);
        botaoListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarActionPerformed(evt);
            }
        });

        botaoCadastrar.setBackground(new java.awt.Color(40, 203, 58));
        botaoCadastrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBorder(null);
        botaoCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(60, 21));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(60, 21));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivBotoesAddUsuárioLayout = new javax.swing.GroupLayout(DivBotoesAddUsuário);
        DivBotoesAddUsuário.setLayout(DivBotoesAddUsuárioLayout);
        DivBotoesAddUsuárioLayout.setHorizontalGroup(
            DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesAddUsuárioLayout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DivBotoesAddUsuárioLayout.createSequentialGroup()
                        .addComponent(soutEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DivBotoesAddUsuárioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddUsuárioLayout.createSequentialGroup()
                                .addComponent(soutCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DivBotoesAddUsuárioLayout.createSequentialGroup()
                                .addComponent(soutNome)
                                .addGap(18, 18, 18)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddUsuárioLayout.createSequentialGroup()
                                .addComponent(soutSenhaAcesso)
                                .addGap(18, 18, 18)
                                .addComponent(inputSenhaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddUsuárioLayout.createSequentialGroup()
                                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soutSenhaAcesso1)
                                    .addComponent(soutUf)
                                    .addComponent(soutCidade)
                                    .addComponent(soutEndereco)
                                    .addComponent(soutBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(inputUf)
                                        .addComponent(inputCidade)
                                        .addComponent(inputEndereco))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesAddUsuárioLayout.createSequentialGroup()
                                .addComponent(soutNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DivBotoesAddUsuárioLayout.createSequentialGroup()
                                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        DivBotoesAddUsuárioLayout.setVerticalGroup(
            DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesAddUsuárioLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutNome))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutCpf))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutEmail))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSenhaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutSenhaAcesso))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutSenhaAcesso1))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutUf))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutCidade)
                    .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutEndereco))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutBairro))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutNumero))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DivAddUsuárioLayout = new javax.swing.GroupLayout(DivAddUsuário);
        DivAddUsuário.setLayout(DivAddUsuárioLayout);
        DivAddUsuárioLayout.setHorizontalGroup(
            DivAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivAddUsuárioLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(DivBotoesAddUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        DivAddUsuárioLayout.setVerticalGroup(
            DivAddUsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivAddUsuárioLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(DivBotoesAddUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivAddUsuário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivAddUsuário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoActionPerformed

    private void inputNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new MenuAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarActionPerformed
        new ListarFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
//        Funcionario funcionario = new Funcionario();
//        
//        funcionario.setEmail(inputEmail.getText());
//        funcionario.setSenha(inputSenhaAcesso.getText());
//        
//        Repositorio.funcionario.add(funcionario);
//        
//        for(int i = 0; i < Repositorio.funcionario.size(); i ++ ){
//            System.out.println(Repositorio.funcionario.get(i));
//        }
        
        
        
    }//GEN-LAST:event_botaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(AddFuncionarioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFuncionarioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFuncionarioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFuncionarioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFuncionarioAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DivAddUsuário;
    private javax.swing.JPanel DivBotoesAddUsuário;
    private javax.swing.JPanel Foother;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JTextField inputCidade;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNumero;
    private javax.swing.JTextField inputSenhaAcesso;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JTextField inputUf;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel soutBairro;
    private javax.swing.JLabel soutCidade;
    private javax.swing.JLabel soutCpf;
    private javax.swing.JLabel soutEmail;
    private javax.swing.JLabel soutEndereco;
    private javax.swing.JLabel soutNome;
    private javax.swing.JLabel soutNumero;
    private javax.swing.JLabel soutSenhaAcesso;
    private javax.swing.JLabel soutSenhaAcesso1;
    private javax.swing.JLabel soutUf;
    // End of variables declaration//GEN-END:variables
}
