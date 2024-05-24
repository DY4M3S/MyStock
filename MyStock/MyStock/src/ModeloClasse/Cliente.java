package ModeloClasse;

public class Cliente extends Usuario {
   
    public Cliente(int id, String nome, String cpf, String email, int telefone, String senha, String uf, String cidade, String endereco, int numero, String bairro) {
        super(id, nome, cpf, email, telefone, senha, uf, cidade, endereco, numero, bairro);
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
}
