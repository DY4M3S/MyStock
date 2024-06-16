/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Interface.vendas.RegistrarVendas;
import Interface.produto.AddProduto;
import Interface.funcionario.AddFuncionario;
import ModeloClasse.Administrador;
import ModeloClasse.Funcionario;
import Repositorio.Repositorio;
/**
 *
 * @author Jason
 */
public class Menu extends javax.swing.JFrame {
    private Administrador administrador;
    private Funcionario funcionario;
  
    public Menu(Administrador administrador) {
        this.administrador = administrador;
        initComponents();
    }
    
    public Menu() {
        this.administrador = null;
        initComponents();
        esconderCamposIniciais();
    }

    private void esconderCamposIniciais( ) {
       if (this.administrador == null || !this.administrador.IsAdm()) {
            esconderBotaoAddFuncionario();
        }
    }
    
    private void  esconderBotaoAddFuncionario() {
        this.BotaoAddFuncionario.setVisible(false);
    }
    
     private void logOut() {
      if (Repositorio.administrador.get(0).IsAdm()) {
          Repositorio.administrador.get(0).setAdm(false);
      }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DivMenuAdm = new javax.swing.JPanel();
        DivBotoes = new javax.swing.JPanel();
        BotaoAddFuncionario = new javax.swing.JButton();
        BotaoRegistrarVendas = new javax.swing.JButton();
        BotaoGerarRelatorio = new javax.swing.JButton();
        BotaoAddProduto = new javax.swing.JButton();
        Foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        BotaoMenu = new javax.swing.JMenuBar();
        BotaoSistema = new javax.swing.JMenu();
        BotaoLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(800, 725));

        DivMenuAdm.setBackground(new java.awt.Color(255, 255, 255));

        DivBotoes.setBackground(new java.awt.Color(255, 255, 255));
        DivBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BotaoAddFuncionario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BotaoAddFuncionario.setText("Adicionar um novo funcionário");
        BotaoAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAddFuncionarioActionPerformed(evt);
            }
        });

        BotaoRegistrarVendas.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BotaoRegistrarVendas.setText("Registrar vendas");
        BotaoRegistrarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRegistrarVendasActionPerformed(evt);
            }
        });

        BotaoGerarRelatorio.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BotaoGerarRelatorio.setText("Gerar relatório ");
        BotaoGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarRelatorioActionPerformed(evt);
            }
        });

        BotaoAddProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BotaoAddProduto.setText("Adicionar um novo produto");
        BotaoAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAddProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DivBotoesLayout = new javax.swing.GroupLayout(DivBotoes);
        DivBotoes.setLayout(DivBotoesLayout);
        DivBotoesLayout.setHorizontalGroup(
            DivBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesLayout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addGroup(DivBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoRegistrarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAddFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAddProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 120, Short.MAX_VALUE))
        );
        DivBotoesLayout.setVerticalGroup(
            DivBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivBotoesLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(BotaoAddFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BotaoAddProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BotaoRegistrarVendas)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(BotaoGerarRelatorio)
                .addGap(0, 70, Short.MAX_VALUE))
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

        javax.swing.GroupLayout DivMenuAdmLayout = new javax.swing.GroupLayout(DivMenuAdm);
        DivMenuAdm.setLayout(DivMenuAdmLayout);
        DivMenuAdmLayout.setHorizontalGroup(
            DivMenuAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivMenuAdmLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(DivBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DivMenuAdmLayout.setVerticalGroup(
            DivMenuAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivMenuAdmLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(DivBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        BotaoSistema.setText("Sistema");

        BotaoLogin.setText("Login");
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });
        BotaoSistema.add(BotaoLogin);

        BotaoMenu.add(BotaoSistema);

        setJMenuBar(BotaoMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DivMenuAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DivMenuAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAddFuncionarioActionPerformed
        new AddFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoAddFuncionarioActionPerformed

    private void BotaoRegistrarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRegistrarVendasActionPerformed
        new RegistrarVendas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoRegistrarVendasActionPerformed

    private void BotaoGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarRelatorioActionPerformed
        new GerarRelatorio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoGerarRelatorioActionPerformed

    private void BotaoAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAddProdutoActionPerformed
        new AddProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoAddProdutoActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed
       logOut();
       new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BotaoLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAddFuncionario;
    private javax.swing.JButton BotaoAddProduto;
    private javax.swing.JButton BotaoGerarRelatorio;
    private javax.swing.JMenuItem BotaoLogin;
    private javax.swing.JMenuBar BotaoMenu;
    private javax.swing.JButton BotaoRegistrarVendas;
    private javax.swing.JMenu BotaoSistema;
    private javax.swing.JPanel DivBotoes;
    private javax.swing.JPanel DivMenuAdm;
    private javax.swing.JPanel Foother;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JLabel c;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}