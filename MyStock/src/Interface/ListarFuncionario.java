/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import ModeloClasse.Funcionario;
import Repositorio.Repositorio;

/**
 *
 * @author Jason
 */
public class ListarFuncionario extends javax.swing.JFrame {
 
    /**
     * Creates new form EditarFuncionario
     */
    public ListarFuncionario() {
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

        divListarFuncionario = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        DivBotoes = new javax.swing.JScrollPane();
        DivLista = new javax.swing.JList<>();
        botaoVoltar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar funcionário");
        setMaximumSize(new java.awt.Dimension(1012, 800));
        setMinimumSize(new java.awt.Dimension(700, 680));
        setPreferredSize(new java.awt.Dimension(800, 700));

        divListarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        divListarFuncionario.setMaximumSize(new java.awt.Dimension(0, 0));
        divListarFuncionario.setPreferredSize(new java.awt.Dimension(800, 700));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        DivLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DivLista.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        DivBotoes.setViewportView(DivLista);

        botaoVoltar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setBorder(null);
        botaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(237, 70, 70));
        botaoExcluir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(null);
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoEditar.setBackground(new java.awt.Color(40, 203, 58));
        botaoEditar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(null);
        botaoEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEditar.setMaximumSize(new java.awt.Dimension(60, 21));
        botaoEditar.setMinimumSize(new java.awt.Dimension(60, 21));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divListarFuncionarioLayout = new javax.swing.GroupLayout(divListarFuncionario);
        divListarFuncionario.setLayout(divListarFuncionarioLayout);
        divListarFuncionarioLayout.setHorizontalGroup(
            divListarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(foother, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(divListarFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(divListarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(divListarFuncionarioLayout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DivBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        divListarFuncionarioLayout.setVerticalGroup(
            divListarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divListarFuncionarioLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DivBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(divListarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(divListarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(divListarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new AddFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        new EditarFuncionario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DivBotoes;
    private javax.swing.JList<String> DivLista;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JPanel divListarFuncionario;
    private javax.swing.JPanel foother;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
