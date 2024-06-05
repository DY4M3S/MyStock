package ModeloClasse;

public class Administrador {
    
    private boolean Adm;
    private String email;
    private String senha;

    public Administrador(boolean isAdm, String email, String senha) {
        this.Adm = isAdm;
        this.email = email;
        this.senha = senha;
    }

    public boolean IsAdm() {
        return Adm;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Administrador{" + "isAdm=" + Adm + ", email=" + email + ", senha=" + senha + '}';
    }

}
