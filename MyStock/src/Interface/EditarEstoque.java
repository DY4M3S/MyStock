/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author Laboratorio
 */
public class EditarEstoque extends javax.swing.JFrame {

    /**
     * Creates new form EditarEstoque
     */
    public EditarEstoque() {
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

        DivMenuEstoque = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        DivBotoesEstoque = new javax.swing.JPanel();
        soutNomeEstoque = new javax.swing.JLabel();
        soutEnderecoEstoque = new javax.swing.JLabel();
        inputNomeEstoque = new javax.swing.JTextField();
        inputEnderecoEstoque = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar estoque");
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(912, 883));

        DivMenuEstoque.setBackground(new java.awt.Color(255, 255, 255));

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

        DivBotoesEstoque.setBackground(new java.awt.Color(255, 255, 255));
        DivBotoesEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        soutNomeEstoque.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNomeEstoque.setText("Nome do estoque:");

        soutEnderecoEstoque.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEnderecoEstoque.setText("Endereço do estoque:");

        inputNomeEstoque.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputNomeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeEstoqueActionPerformed(evt);
            }
        });

        inputEnderecoEstoque.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEnderecoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoEstoqueActionPerformed(evt);
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

        botaoSalvar.setBackground(new java.awt.Color(40, 203, 58));
        botaoSalvar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(null);
        botaoSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvar.setMaximumSize(new java.awt.Dimension(60, 21));
        botaoSalvar.setMinimumSize(new java.awt.Dimension(60, 21));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivBotoesEstoqueLayout = new javax.swing.GroupLayout(DivBotoesEstoque);
        DivBotoesEstoque.setLayout(DivBotoesEstoqueLayout);
        DivBotoesEstoqueLayout.setHorizontalGroup(
            DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesEstoqueLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DivBotoesEstoqueLayout.createSequentialGroup()
                        .addGroup(DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soutNomeEstoque)
                            .addComponent(soutEnderecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputNomeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(inputEnderecoEstoque)))
                    .addGroup(DivBotoesEstoqueLayout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        DivBotoesEstoqueLayout.setVerticalGroup(
            DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesEstoqueLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutNomeEstoque)
                    .addComponent(inputNomeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutEnderecoEstoque)
                    .addComponent(inputEnderecoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(DivBotoesEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DivMenuEstoqueLayout = new javax.swing.GroupLayout(DivMenuEstoque);
        DivMenuEstoque.setLayout(DivMenuEstoqueLayout);
        DivMenuEstoqueLayout.setHorizontalGroup(
            DivMenuEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivMenuEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DivBotoesEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DivMenuEstoqueLayout.setVerticalGroup(
            DivMenuEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivMenuEstoqueLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DivBotoesEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivMenuEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivMenuEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeEstoqueActionPerformed

    private void inputEnderecoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoEstoqueActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new ListarEstoque().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DivBotoesEstoque;
    private javax.swing.JPanel DivMenuEstoque;
    private javax.swing.JPanel Foother;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JTextField inputEnderecoEstoque;
    private javax.swing.JTextField inputNomeEstoque;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel soutEnderecoEstoque;
    private javax.swing.JLabel soutNomeEstoque;
    // End of variables declaration//GEN-END:variables
}
