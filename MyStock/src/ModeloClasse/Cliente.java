package ModeloClasse;

public class Cliente extends Usuario {

    public Cliente(int id, String nome, String cpf, String email, int telefone, String uf, String cidade, String endereco, int numero, String bairro) {
        super(id, nome, cpf, email, telefone, uf, cidade, endereco, numero, bairro);
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
}
