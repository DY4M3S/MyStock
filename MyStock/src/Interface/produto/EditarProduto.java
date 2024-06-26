/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.produto;

import ModeloClasse.Estoque;
import ModeloClasse.Produto;
import Repositorio.Repositorio;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class EditarProduto extends javax.swing.JFrame {
    private ListarProduto tela;
    private Produto p;
    
    /**
     * Creates new form EditarProduto
     */
    public EditarProduto(ListarProduto tela, Produto p) {
        this.tela = tela;
        this.p = p;
        initComponents();
        esconderCamposIniciais();
        carregarProdutos();
        trazerDadosProduto();
        
    }

        private Estoque buscarEstoquePorNome(String nomeEstoque) {
            for (Estoque e : Repositorio.estoque) {
                if (e.getNome().equals(nomeEstoque)) {
                    return e;
                }
            }
            return null;
        }

        private boolean existeEstoque(String nomeEstoque) {
            for (Estoque e : Repositorio.estoque) {
                if (e.getNome().equals(nomeEstoque)) {
                    return true;
                }
            }
            return false;
        }

        public void carregarProdutos() {
            HashSet<String> nomesEstoque = new HashSet<>();
            for (Produto p : Repositorio.produto) {
                String nomeEstoque = p.getNomeEstoque();
                if (!nomesEstoque.contains(nomeEstoque)) {
                    this.soutEstoqueDisponivelSelecao.addItem(nomeEstoque);
                    nomesEstoque.add(nomeEstoque);
                }
            }
        }

        private int converterParaInteiro(String numeroString) {
            try {
                
                int numeroInteiro = Integer.parseInt(numeroString);
                return numeroInteiro;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, no campo Quantidade"
                        + "\n\nInsira somente números inteiros sem espaços. Letras e caracteres especiais não podem ser inseridos.");
                return 0;
            }
        }

        private float converterParaNumero(String numeroString) {
            try {
                float numeroFloat = Float.parseFloat(numeroString);
                return numeroFloat;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, no campo Valor unitário"
                        + "\n\nInsira somente números decimais (exemplo: 1 ou 1.50) sem espaços. Letras e caracteres especiais não podem ser inseridos.");
                return 0.0f;
            }
        }

        private void trazerDadosProduto() {
            this.inputNomeProduto.setText(p.getNome());
            this.inputQuantidade.setText(String.valueOf(p.getQuantidade()));
            this.inputValorUnitario.setText(String.valueOf(p.getValorUnitario()));
            this.inputEstoque.setText(p.getNomeEstoque());
            this.inputEspecificacaoTecnica.setText(p.getEspecificacaoTecnica());
            this.soutEstoqueDisponivelSelecao.setSelectedItem(p.getNomeEstoque());
        }
    
    private boolean naoSalvaVazio(Produto p){
        if (p.getQuantidade() >= 0 && p.getValorUnitario() >= 0.0f
                && !p.getNome().isEmpty() && !p.getNomeEstoque().isEmpty()
                && !p.getEspecificacaoTecnica().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    private void esconderCamposIniciais() {
    inputEstoque.setVisible(false); 
    soutEstoque.setVisible(false);
}
    
    private void limpar() {
        this.inputNomeProduto.setText("");
        this.inputQuantidade.setText("");
        this.inputValorUnitario.setText("");
        this.inputEstoque.setText("");
        this.inputEspecificacaoTecnica.setText("");
        this.soutEstoqueDisponivelSelecao.setSelectedItem("");
        this.inputNomeProduto.requestFocus();
    }
    
   /* private static boolean isFieldEmpty(String field) {
        return field == null || field.trim().isEmpty();
    }
        
    private static boolean isFieldEmpty(Integer field) {
        if(field == 0 || field == null){
             return true;
        }
        return false;
    }
    
     private static boolean isFieldEmpty(Float field) {
        if(field == 0 || field == null){
             return true;
        }
        return false;
    }*/
    
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
        inputEspecificacaoTecnica = new javax.swing.JTextArea();
        botaoVoltar = new javax.swing.JButton();
        botaoSalvar1 = new javax.swing.JButton();
        soutEstoqueDiponivel = new javax.swing.JLabel();
        soutEstoqueDisponivelSelecao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar produto");
        setMinimumSize(new java.awt.Dimension(875, 850));

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

        inputEspecificacaoTecnica.setColumns(20);
        inputEspecificacaoTecnica.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEspecificacaoTecnica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputEspecificacaoTecnica.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(inputEspecificacaoTecnica);

        botaoVoltar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setBorder(null);
        botaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSalvar1.setBackground(new java.awt.Color(40, 203, 58));
        botaoSalvar1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoSalvar1.setText("Salvar");
        botaoSalvar1.setBorder(null);
        botaoSalvar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvar1.setMaximumSize(new java.awt.Dimension(60, 21));
        botaoSalvar1.setMinimumSize(new java.awt.Dimension(60, 21));
        botaoSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvar1ActionPerformed(evt);
            }
        });

        soutEstoqueDiponivel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEstoqueDiponivel.setText("Estoque disponível:");

        soutEstoqueDisponivelSelecao.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutEstoqueDisponivelSelecao.setToolTipText("");
        soutEstoqueDisponivelSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soutEstoqueDisponivelSelecaoActionPerformed(evt);
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
                        .addComponent(botaoSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soutEspecificacaoTecnica)
                            .addComponent(soutEstoque)
                            .addComponent(soutValorUnitario)
                            .addComponent(soutQuantidade)
                            .addComponent(soutNomeProduto)
                            .addComponent(soutEstoqueDiponivel))
                        .addGap(18, 18, 18)
                        .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soutEstoqueDisponivelSelecao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNomeProduto)
                            .addComponent(inputQuantidade)
                            .addComponent(inputValorUnitario)
                            .addComponent(inputEstoque)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))))
                .addGap(100, 100, 100))
        );
        DivBotoesProdutoLayout.setVerticalGroup(
            DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutNomeProduto)
                    .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutQuantidade)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutValorUnitario)
                    .addComponent(inputValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutEstoque)
                    .addComponent(inputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutEstoqueDiponivel)
                    .addComponent(soutEstoqueDisponivelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addComponent(soutEspecificacaoTecnica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DivBotoesProdutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DivBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DivMenuProdutoLayout = new javax.swing.GroupLayout(DivMenuProduto);
        DivMenuProduto.setLayout(DivMenuProdutoLayout);
        DivMenuProdutoLayout.setHorizontalGroup(
            DivMenuProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DivMenuProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DivBotoesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DivMenuProdutoLayout.setVerticalGroup(
            DivMenuProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivMenuProdutoLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DivBotoesProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
       
    }//GEN-LAST:event_inputEstoqueActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new ListarProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvar1ActionPerformed
        String nomeProduto = this.inputNomeProduto.getText();
        int quantidade = converterParaInteiro(this.inputQuantidade.getText());
        float valorUnitario = converterParaNumero(this.inputValorUnitario.getText());
        String nomeEstoque = this.inputEstoque.getText();
        String especificacaoTecnica = this.inputEspecificacaoTecnica.getText();

        Produto produtoEditado = new Produto(nomeProduto, quantidade, valorUnitario, nomeEstoque, especificacaoTecnica);
        Estoque estoqueExistente = buscarEstoquePorNome(nomeEstoque);
        String estoqueSelecionado = (String) soutEstoqueDisponivelSelecao.getSelectedItem();

        if (!nomeEstoque.isEmpty() && !estoqueSelecionado.equals(nomeEstoque)) {
            Estoque estoqueExistenteDoProdutoEditado = buscarEstoquePorNome(estoqueSelecionado);
            if (estoqueExistenteDoProdutoEditado == null) {
                JOptionPane.showMessageDialog(this, "O estoque selecionado não existe!");
                return;
            } else {
                produtoEditado.setNomeEstoque(estoqueSelecionado);
            }
        }

        int confirmar = JOptionPane.showConfirmDialog(this, "Você realmente deseja alterar os dados deste produto?",
                "Confirmar alteração",
                JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            if (naoSalvaVazio(produtoEditado)) {
                Repositorio.produto.remove(p);
                Repositorio.produto.add(produtoEditado);
                JOptionPane.showMessageDialog(this, "Produto editado com sucesso!");
                carregarProdutos();
                new ListarProduto().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "O produto deve apresentar todos os campos preenchidos corretamente!");
            }
        } else {
            trazerDadosProduto();
        }
    }//GEN-LAST:event_botaoSalvar1ActionPerformed

    private void soutEstoqueDisponivelSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soutEstoqueDisponivelSelecaoActionPerformed
        
    }//GEN-LAST:event_soutEstoqueDisponivelSelecaoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
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
    private javax.swing.JButton botaoSalvar1;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JTextArea inputEspecificacaoTecnica;
    private javax.swing.JTextField inputEstoque;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JTextField inputValorUnitario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel soutEspecificacaoTecnica;
    private javax.swing.JLabel soutEstoque;
    private javax.swing.JLabel soutEstoqueDiponivel;
    private javax.swing.JComboBox<String> soutEstoqueDisponivelSelecao;
    private javax.swing.JLabel soutNomeProduto;
    private javax.swing.JLabel soutQuantidade;
    private javax.swing.JLabel soutValorUnitario;
    // End of variables declaration//GEN-END:variables
}
