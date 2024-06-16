/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.vendas;

import Interface.Menu;
import Interface.cliente.AddCliente;
import Repositorio.Repositorio;
import javax.swing.JOptionPane;
import ModeloClasse.Produto;
import ModeloClasse.Cliente;
import ModeloClasse.Vendas;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Date;

/**
 *
 * @author Jason
 */
public class RegistrarVendas extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarVendas
     */
    public RegistrarVendas() {
        initComponents();
        carregarProdutos();
        carregarClientes();
        inputQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                atualizarValorTotalEPedido();
            }
        });
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

    private int converterNumPedido(String numPedidoString) {
        try {
            int numPedidoInteiro = Integer.parseInt(numPedidoString);
            return numPedidoInteiro;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira somente números inteiros no campo Número do Pedido."
                    + "\n\nLetras, caracteres especiais e espaços não são permitidos.");
            return 0;
        }
    }

    private float converterParaNumero(String numeroString) {
        try {
            float numeroFloat = Float.parseFloat(numeroString);
            return numeroFloat;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, no campo Valor unitário"
                    + "\n\nInsira somente números decimais( exemplo: 1 ou 1.50) sem espaços. Letras e caracteres especiais não podem ser inseridos.");
            return 0.0f;
        }
    }

    private Date converterParaData(String dataString) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date data = formato.parse(dataString);
            return data;
        } catch (ParseException ex) {
            return null;
        }
    }
    
    private void limpar() {
        this.inputDataVenda.setText("");
        this.inputEnderecoEntrega.setText("");
        this.inputNumPedido.setText("");
        this.inputQuantidade.setText("");
        this.inputValorTotalPedido.setText("");
        this.soutClienteDisponivelSelecao.setSelectedItem("");
        this.soutProdutoDisponivelSelecao.setSelectedItem("");

        this.inputNumPedido.requestFocus();
    }
    
     private boolean verificarVendasDuplicadas(Vendas novaVendas) {
            System.out.println(novaVendas);
            for (Vendas v : Repositorio.vendas) {
            if (v.getNumeroPedido() == novaVendas.getNumeroPedido()) {
                return true;
            }
        }
        return false;
    }

    private boolean naoSalvaVazio(Vendas v) {
        String dataVenda = inputDataVenda.getText();
        String enderecoEntrega = inputEnderecoEntrega.getText();
        String numPedido = inputNumPedido.getText();
        String quantidade = inputQuantidade.getText();
        String valorTotal = inputValorTotalPedido.getText();
        String clienteSelecionada = (String) soutClienteDisponivelSelecao.getSelectedItem();
        String produtoSelecionado = (String) soutProdutoDisponivelSelecao.getSelectedItem();

        if (dataVenda.isEmpty() || enderecoEntrega.isEmpty() || numPedido.equalsIgnoreCase("0") || quantidade.equalsIgnoreCase("0") || valorTotal.equalsIgnoreCase("0") || clienteSelecionada == null || clienteSelecionada.isEmpty() || produtoSelecionado == null || produtoSelecionado.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void carregarClientes() {
        for (Cliente cliente : Repositorio.cliente) {
            soutClienteDisponivelSelecao.addItem(cliente.getNome());
        }
    }

    public void carregarProdutos() {
        for (Produto produto : Repositorio.produto) {
            soutProdutoDisponivelSelecao.addItem(produto.getNome());
        }
    }
    
    private void atualizarValorTotalEPedido() {
        String produtoSelecionado = (String) soutProdutoDisponivelSelecao.getSelectedItem();
        int quantidade = converterParaInteiro(inputQuantidade.getText());

        if (produtoSelecionado != null && !produtoSelecionado.isEmpty() && quantidade > 0) {
            Produto produto = null;

            for (Produto p : Repositorio.produto) {
                if (p.getNome().equals(produtoSelecionado)) {
                    produto = p;
                    break;
                }
            }
            float valorTotal = produto.getValorUnitario() * quantidade;
            inputValorTotalPedido.setText(String.valueOf(valorTotal));
        }
    }

    private void decrementarQuantidadeProduto(String nomeProduto, int quantidadeVendida) {
        for (Produto p : Repositorio.produto) {
            if (p.getNome().equals(nomeProduto)) {
                int novaQuantidade = p.getQuantidade() - quantidadeVendida;
                if (novaQuantidade < 0) {
                    JOptionPane.showMessageDialog(this, "Quantidade em estoque insuficiente para realizar o pedido.");
                    return;
                }
                p.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
    
     private boolean validarQuantidadeEstoque(int quantidade){
         String produtoSelecionado = (String) soutProdutoDisponivelSelecao.getSelectedItem();
         Produto produto = null;
         for (Produto p : Repositorio.produto) {
             if (p.getNome().equals(produtoSelecionado)) {
                 produto = p;
                 break;
             }
         }
         if (produto != null) {
             if (quantidade > produto.getQuantidade()) {
                 JOptionPane.showMessageDialog(this, "Quantidade em estoque insuficiente para o pedido.");
                 return false;
             }
             return true;
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

        DivRegistrarVendas = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Foother = new javax.swing.JPanel();
        MyStock = new javax.swing.JLabel();
        Todos = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        DivBotoesRegistrarVendas = new javax.swing.JPanel();
        soutNúmeroPedido = new javax.swing.JLabel();
        soutNomeCliente = new javax.swing.JLabel();
        soutQuantidade = new javax.swing.JLabel();
        soutValorTotalPedido = new javax.swing.JLabel();
        soutValorTotalPedido1 = new javax.swing.JLabel();
        inputNumPedido = new javax.swing.JTextField();
        inputValorTotalPedido = new javax.swing.JTextField();
        inputQuantidade = new javax.swing.JTextField();
        inputEnderecoEntrega = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        soutNomeProduto = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        soutDataVenda = new javax.swing.JLabel();
        inputDataVenda = new javax.swing.JTextField();
        soutClienteDisponivelSelecao = new javax.swing.JComboBox<>();
        soutProdutoDisponivelSelecao = new javax.swing.JComboBox<>();
        MenuCadastrar = new javax.swing.JMenuBar();
        CadastrarCliente = new javax.swing.JMenu();
        botaoCadastrarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar vendas");
        setMinimumSize(new java.awt.Dimension(700, 825));

        DivRegistrarVendas.setBackground(new java.awt.Color(255, 255, 255));

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

        DivBotoesRegistrarVendas.setBackground(new java.awt.Color(255, 255, 255));
        DivBotoesRegistrarVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        soutNúmeroPedido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNúmeroPedido.setText("Número do pedido:");

        soutNomeCliente.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNomeCliente.setText("Nome do cliente:");

        soutQuantidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutQuantidade.setText("Quantidade:");

        soutValorTotalPedido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutValorTotalPedido.setText("Endereço de entrega:");

        soutValorTotalPedido1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutValorTotalPedido1.setText("Valor total do pedido:");

        inputNumPedido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputNumPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumPedidoActionPerformed(evt);
            }
        });

        inputValorTotalPedido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputValorTotalPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorTotalPedidoActionPerformed(evt);
            }
        });

        inputQuantidade.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantidadeActionPerformed(evt);
            }
        });

        inputEnderecoEntrega.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputEnderecoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoEntregaActionPerformed(evt);
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

        botaoExcluir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botaoExcluir.setText("Listar");
        botaoExcluir.setBorder(null);
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        soutNomeProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutNomeProduto.setText("Nome do produto:");

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

        soutDataVenda.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutDataVenda.setText("Data da venda:");

        inputDataVenda.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        inputDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataVendaActionPerformed(evt);
            }
        });

        soutClienteDisponivelSelecao.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        soutClienteDisponivelSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soutClienteDisponivelSelecaoActionPerformed(evt);
            }
        });

        soutProdutoDisponivelSelecao.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        javax.swing.GroupLayout DivBotoesRegistrarVendasLayout = new javax.swing.GroupLayout(DivBotoesRegistrarVendas);
        DivBotoesRegistrarVendas.setLayout(DivBotoesRegistrarVendasLayout);
        DivBotoesRegistrarVendasLayout.setHorizontalGroup(
            DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesRegistrarVendasLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DivBotoesRegistrarVendasLayout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DivBotoesRegistrarVendasLayout.createSequentialGroup()
                        .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soutValorTotalPedido1)
                            .addComponent(soutQuantidade)
                            .addComponent(soutValorTotalPedido)
                            .addComponent(soutNúmeroPedido)
                            .addComponent(soutNomeProduto)
                            .addComponent(soutNomeCliente)
                            .addComponent(soutDataVenda))
                        .addGap(18, 18, 18)
                        .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(inputNumPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(inputQuantidade)
                            .addComponent(inputValorTotalPedido)
                            .addComponent(inputEnderecoEntrega)
                            .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(soutProdutoDisponivelSelecao, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE)
                                .addComponent(soutClienteDisponivelSelecao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        DivBotoesRegistrarVendasLayout.setVerticalGroup(
            DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivBotoesRegistrarVendasLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutNúmeroPedido)
                    .addComponent(inputNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutNomeCliente)
                    .addComponent(soutClienteDisponivelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutNomeProduto)
                    .addComponent(soutProdutoDisponivelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soutQuantidade))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutValorTotalPedido1)
                    .addComponent(inputValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutDataVenda)
                    .addComponent(inputDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soutValorTotalPedido)
                    .addComponent(inputEnderecoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DivBotoesRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout DivRegistrarVendasLayout = new javax.swing.GroupLayout(DivRegistrarVendas);
        DivRegistrarVendas.setLayout(DivRegistrarVendasLayout);
        DivRegistrarVendasLayout.setHorizontalGroup(
            DivRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Foother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivRegistrarVendasLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(DivBotoesRegistrarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        DivRegistrarVendasLayout.setVerticalGroup(
            DivRegistrarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivRegistrarVendasLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(DivBotoesRegistrarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Foother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CadastrarCliente.setText("Cadastrar cliente");

        botaoCadastrarCliente.setText("Cadastrar novo cliente");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });
        CadastrarCliente.add(botaoCadastrarCliente);

        MenuCadastrar.add(CadastrarCliente);

        setJMenuBar(MenuCadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivRegistrarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DivRegistrarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputValorTotalPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorTotalPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorTotalPedidoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        if (Repositorio.administrador.get(0).IsAdm()) {
            new Menu(Repositorio.administrador.get(0)).setVisible(true);
            this.dispose();
        } else {
            new Menu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        new ListarRegistrarVendas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void inputNumPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumPedidoActionPerformed

    private void inputQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputQuantidadeActionPerformed

    private void inputEnderecoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoEntregaActionPerformed

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        new AddCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Date dataVenda = converterParaData(inputDataVenda.getText());
        
        if (dataVenda == null) {
            JOptionPane.showMessageDialog(this, "Por favor, insira  data e hora, no formato de dd/MM/yyyy HH:mm:ss.");
            return; 
        }
        
        String enderecoEntrega = inputEnderecoEntrega.getText();
        int numeroPedido = converterNumPedido(inputNumPedido.getText());
        int quantidade = converterParaInteiro(inputQuantidade.getText());
        float valorTotal = converterParaNumero(inputValorTotalPedido.getText());
        String cliente = (String) soutClienteDisponivelSelecao.getSelectedItem();
        String produto = (String) soutProdutoDisponivelSelecao.getSelectedItem();
        
        Vendas v = new Vendas(cliente,numeroPedido,produto,dataVenda,quantidade,valorTotal,enderecoEntrega);
        
        atualizarValorTotalEPedido();
        if(naoSalvaVazio(v) && !verificarVendasDuplicadas(v) && validarQuantidadeEstoque(quantidade)){
            Repositorio.vendas.add(v);
            JOptionPane.showMessageDialog(this, "Pedido cadastrado com sucesso!");
            decrementarQuantidadeProduto(produto, quantidade);
            limpar();
            carregarProdutos();
            carregarClientes();
            new RegistrarVendas().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "O pedido deve apresentar todos os campos preenchidos corretamente!");
            return;
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void inputDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataVendaActionPerformed

    private void soutClienteDisponivelSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soutClienteDisponivelSelecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soutClienteDisponivelSelecaoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistrarVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CadastrarCliente;
    private javax.swing.JPanel DivBotoesRegistrarVendas;
    private javax.swing.JPanel DivRegistrarVendas;
    private javax.swing.JPanel Foother;
    private javax.swing.JPanel Header;
    private javax.swing.JMenuBar MenuCadastrar;
    private javax.swing.JLabel MyStock;
    private javax.swing.JLabel Todos;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JMenuItem botaoCadastrarCliente;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel c;
    private javax.swing.JTextField inputDataVenda;
    private javax.swing.JTextField inputEnderecoEntrega;
    private javax.swing.JTextField inputNumPedido;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JTextField inputValorTotalPedido;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> soutClienteDisponivelSelecao;
    private javax.swing.JLabel soutDataVenda;
    private javax.swing.JLabel soutNomeCliente;
    private javax.swing.JLabel soutNomeProduto;
    private javax.swing.JLabel soutNúmeroPedido;
    private javax.swing.JComboBox<String> soutProdutoDisponivelSelecao;
    private javax.swing.JLabel soutQuantidade;
    private javax.swing.JLabel soutValorTotalPedido;
    private javax.swing.JLabel soutValorTotalPedido1;
    // End of variables declaration//GEN-END:variables
}
