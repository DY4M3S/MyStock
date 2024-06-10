package ModeloClasse;

import java.util.List;

public class Estoque {
    private int id;
    private String nome;

    public Estoque(String nome) {
        this.nome = nome;
    }
    
    public Estoque(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Estoque{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
    
}
