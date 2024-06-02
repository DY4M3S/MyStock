package ModeloClasse;

public class Administrador extends Usuario {
    
    private boolean id_adm;

    public Administrador(boolean id_adm, int id, String nome, String cpf, String email, int telefone, String senha, String uf, String cidade, String endereco, int numero, String bairro) {
        super(id, nome, cpf, email, telefone, senha, uf, cidade, endereco, numero, bairro);
        this.id_adm = id_adm;
    }

    public Administrador(boolean id_adm, int id, String email, String senha) {
        super(id, email, senha);
        this.id_adm = id_adm;
    }
    
    @Override
    public String toString() {
        return "Administrador{" + "id_adm=" + id_adm + '}';
    }
    
   
}
