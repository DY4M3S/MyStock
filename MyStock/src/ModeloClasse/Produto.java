package ModeloClasse;

import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private float valorUnitario;
    private List<Estoque> estoque;
    private String especificacaoTecnica;

    public Produto(int id, String nome, int quantidade, float valorUnitario, List<Estoque> estoque, String especificacaoTecnica) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.estoque = estoque;
        this.especificacaoTecnica = especificacaoTecnica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public List<Estoque> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Estoque> estoque) {
        this.estoque = estoque;
    }

    public String getEspecificacaoTecnica() {
        return especificacaoTecnica;
    }

    public void setEspecificacaoTecnica(String especificacaoTecnica) {
        this.especificacaoTecnica = especificacaoTecnica;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", estoque=" + estoque + ", especificacaoTecnica=" + especificacaoTecnica + '}';
    }

}
