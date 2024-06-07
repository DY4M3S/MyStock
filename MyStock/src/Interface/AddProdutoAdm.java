/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author Jason
 */
public class AddProdutoAdm extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
    public AddProdutoAdm() {
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

        DivMenuProduto = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        DivBotoesProduto = new javax.swing.JPanel();
        soutNomeProduto = new javax.swing.JLabel();
        soutQuantidade = new javax.swing.JLabel();
        inputNomeProduto = new javax.swing.JTextField();
        inputQuantidade = new javax.swing.JTextField();
        soutEstoque = new javax.swing.JLabel();
        soutValorUnitario = new javax.swing.JLabel();
        soutEspecificacaoTecnica = new javax.swing.JLabel();
        inputValorUnitario = new javax.swing.JTextField();
        inputEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botaoVoltar = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        botaoCadastrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");
        setMinimumSize(new java.awt.Dimension(875, 850));
        setPreferredSize(new java.awt.Dimension(875, 850));

        DivMenuProduto.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        DivBotoesProduto.setBackground(new java.awt.Color(255, 255, 255));
        DivBotoesProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DivBotoesProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        soutNomeProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNomeProduto.setText("Nome do produto:");

        soutQuantidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutQuantidade.setText("Quantidade:");

        inputNomeProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeProdutoActionPerformed(evt);
            }
        });

        inputQuantidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantidadeActionPerformed(evt);
            }
        });

        soutEstoque.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEstoque.setText("Estoque:");

        soutValorUnitario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutValorUnitario.setText("Valor unitário:");

        soutEspecificacaoTecnica.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEspecificacaoTecnica.setText("Especificação técnica:");

        inputValorUnitario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorUnitarioActionPerformed(evt);
            }
        });

        inputEstoque.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEstoqueActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

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

        botaoCadastrar1.setBackground(new java.awt.Color(40, 203, 58));
        botaoCadastrar1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoCadastrar1.setText("Cadastrar");
        botaoCadastrar1.setBorder(null);
        botaoCadastrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastrar1.setMaximumSize(new java.awt.Dimension(60, 21));
        botaoCadastrar1.setMinimumSize(new java.awt.Dimension(60, 21));
        botaoCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivBotoesProdutoLayout = new javax.swing.GroupLayout(DivBotoesProduto);
        DivBotoesProduto.setLayout(DivBotoesProdutoLayout);
        DivBotoesProdutoLayout.setHorizontalGroup(
            DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soutEspecificacaoTecnica)
                            .addComponent(soutEstoque)
                            .addComponent(soutValorUnitario)
                            .addComponent(soutQuantidade)
                            .addComponent(soutNomeProduto))
                        .addGap(18, 18, 18)
                        .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNomeProduto)
                            .addComponent(inputQuantidade)
                            .addComponent(inputValorUnitario)
                            .addComponent(inputEstoque)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        DivBotoesProdutoLayout.setVerticalGroup(
            DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutNomeProduto)
                    .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutQuantidade)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutValorUnitario)
                    .addComponent(inputValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutEstoque)
                    .addComponent(inputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addComponent(soutEspecificacaoTecnica)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout DivMenuProdutoLayout = new javax.swing.GroupLayout(DivMenuProduto);
        DivMenuProduto.setLayout(DivMenuProdutoLayout);
        DivMenuProdutoLayout.setHorizontalGroup(
            DivMenuProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DivMenuProdutoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(DivBotoesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        DivMenuProdutoLayout.setVerticalGroup(
            DivMenuProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivMenuProdutoLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(DivBotoesProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(Foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivMenuProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivMenuProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeProdutoActionPerformed

    private void inputQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputQuantidadeActionPerformed

    private void inputValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorUnitarioActionPerformed

    private void inputEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEstoqueActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new MenuAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarActionPerformed
        new ListarProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarActionPerformed

    private void botaoCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrar1ActionPerformed
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

    }//GEN-LAST:event_botaoCadastrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddProdutoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProdutoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProdutoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProdutoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProdutoAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DivBotoesProduto;
    private javax.swing.JPanel DivMenuProduto;
    private javax.swing.JPanel Foother;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JButton botaoCadastrar1;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JTextField inputEstoque;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JTextField inputValorUnitario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel soutEspecificacaoTecnica;
    private javax.swing.JLabel soutEstoque;
    private javax.swing.JLabel soutNomeProduto;
    private javax.swing.JLabel soutQuantidade;
    private javax.swing.JLabel soutValorUnitario;
    // End of variables declaration//GEN-END:variables
}
