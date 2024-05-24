package ModeloClasse;

public class Venda {
    private int id;
    private String nomeCliente;
    private int numeroPedido;
    private int quantidade;
    private float valorTotalDaVenda;
    private String enderecoDeEntrega;

    public Venda(int id,String nomeCliente, int numeroPedido, int quantidade, float valorTotalDaVenda, String enderecoDeEntrega) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
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
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
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
        return "Venda{" + "id=" + id + ", nomeCliente=" + nomeCliente + ", numeroPedido=" + numeroPedido + ", quantidade=" + quantidade + ", valorTotalDaVenda=" + valorTotalDaVenda + ", enderecoDeEntrega=" + enderecoDeEntrega + '}';
    }

   
    
    
    
}
