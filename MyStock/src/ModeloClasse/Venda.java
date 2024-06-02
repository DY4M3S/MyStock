package ModeloClasse;

import java.util.List;

public class Venda {
    private int id;
    private List<Cliente> cliente;
    private int numeroPedido;
    private List<Produto> produto;
    private int quantidade;
    private float valorTotalDaVenda;
    private String enderecoDeEntrega;

    public Venda(int id, List<Cliente> cliente, int numeroPedido, List<Produto> produto, int quantidade, float valorTotalDaVenda, String enderecoDeEntrega) {
        this.id = id;
        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
        this.produto = produto;
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

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
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
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", numeroPedido=" + numeroPedido + ", produto=" + produto + ", quantidade=" + quantidade + ", valorTotalDaVenda=" + valorTotalDaVenda + ", enderecoDeEntrega=" + enderecoDeEntrega + '}';
    }

   

}
