package ModeloClasse;

import java.time.*;
import java.util.Date;
import java.util.List;

public class Vendas {
    private int id;
    private List<Cliente> cliente;
    private int numeroPedido;
    private List<Produto> produto;
    private Date data;
    private int quantidade;
    private float valorTotalDaVenda;
    private String enderecoDeEntrega;

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
        return "Vendas{" + "id=" + id + ", cliente=" + cliente + ", numeroPedido=" + numeroPedido + ", produto=" + produto + ", data=" + data + ", quantidade=" + quantidade + ", valorTotalDaVenda=" + valorTotalDaVenda + ", enderecoDeEntrega=" + enderecoDeEntrega + '}';
    }
    
}
