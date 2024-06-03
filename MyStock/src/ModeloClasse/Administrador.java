package ModeloClasse;

public class Administrador extends Usuario {
    
    private boolean idAdm;

    public Administrador(String nome, String cpf, String email, int telefone, String senha, String uf, String cidade, String endereco, int numero, String bairro) {
        super(nome, cpf, email, telefone, senha, uf, cidade, endereco, numero, bairro);
    }

    public Administrador(String email, String senha) {
        super(email, senha);
    }
    
    public boolean isId_adm() {
        return idAdm;
    } 
    
    @Override
    public String toString() {
        return "Administrador{" + "id_adm=" + idAdm + '}';
    }

}
