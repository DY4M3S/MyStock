package ModeloClasse;

import java.util.Date;

public class Vendas {
    private int id;
    private String cliente;
    private int numeroPedido;
    private String produto;
    private Date data;
    private int quantidade;
    private float valorTotalDaVenda;
    private String enderecoDeEntrega;

    public Vendas(String cliente, int numeroPedido, String produto, Date data, int quantidade, float valorTotalDaVenda, String enderecoDeEntrega) {
        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
        this.produto = produto;
        this.data = data;
        this.quantidade = quantidade;
        this.valorTotalDaVenda = valorTotalDaVenda;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorTotalDaVenda() {
        return valorTotalDaVenda;
    }

    public void setValorTotalDaVenda(float valorTotalDaVenda) {
        this.valorTotalDaVenda = valorTotalDaVenda;
    }

    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public void setEnderecoDeEntrega(String enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    @Override
    public String toString() {
        return "Vendas{" + "cliente=" + cliente + ", numeroPedido=" + numeroPedido + ", produto=" + produto + ", data=" + data + ", quantidade=" + quantidade + ", valorTotalDaVenda=" + valorTotalDaVenda + ", enderecoDeEntrega=" + enderecoDeEntrega + '}';
    }
}
