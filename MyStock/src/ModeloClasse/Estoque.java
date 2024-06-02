package ModeloClasse;

import java.util.List;

public class Estoque {
    private int id;
    private String nome;
    private String endereco;
    private List<Produto> produto;

    public Estoque(int id, String nome, String endereco, List<Produto> produto) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.produto = produto;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Estoque{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", produto=" + produto + '}';
    }

    
}
