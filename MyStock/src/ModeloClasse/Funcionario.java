package ModeloClasse;

public class Funcionario extends Usuario {

    public Funcionario(String nome, String cpf, String email, int telefone, String senha, String uf, String cidade, String endereco, int numero, String bairro) {
        super(nome, cpf, email, telefone, senha, uf, cidade, endereco, numero, bairro);
    }

    public Funcionario(String email, String senha) {
        super(email, senha);
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                super.toString() +
                '}';
    }
    
    
    
}
