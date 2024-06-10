package ModeloClasse;

import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private float valorUnitario;
    private String nomeEstoque;
    private String especificacaoTecnica;

    public Produto(String nome, int quantidade, float valorUnitario, String nomeEstoque, String especificacaoTecnica) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.nomeEstoque = nomeEstoque;
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

    public String getNomeEstoque() {
        return nomeEstoque;
    }

    public void setNomeEstoque(String nomeEstoque) {
        this.nomeEstoque = nomeEstoque;
    }

    public String getEspecificacaoTecnica() {
        return especificacaoTecnica;
    }

    public void setEspecificacaoTecnica(String especificacaoTecnica) {
        this.especificacaoTecnica = especificacaoTecnica;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", nomeEstoque=" + nomeEstoque + ", especificacaoTecnica=" + especificacaoTecnica + '}';
    }

    
}
