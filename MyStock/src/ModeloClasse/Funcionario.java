package ModeloClasse;

public class Funcionario extends Usuario {
    
    public Funcionario(int id, String nome, String cpf, String email, int telefone, String senha, String uf, String cidade, String endereco, int numero, String bairro) {
        super(id, nome, cpf, email, telefone, senha, uf, cidade, endereco, numero, bairro);
    }

    public Funcionario(int id, String email, String senha) {
        super(id, email, senha);
    }

    @Override
    public String toString() {
        return "Funcionario{" + '}';
    }
    
    
}
