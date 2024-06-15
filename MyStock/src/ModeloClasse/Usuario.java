package ModeloClasse;

 abstract public class Usuario {

    private int id;
    private String nome;
    private String cpf;
    private String email; 
    private Long telefone;
    private String senha;
    private String uf;
    private String cidade;
    private String endereco;
    private Long numero;
    private String bairro;

    public Usuario(String nome, String cpf, String email, Long telefone, String senha, String uf, String cidade, String endereco, Long numero, String bairro) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.uf = uf;
        this.cidade = cidade;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Usuario(String nome, String cpf, String email, Long telefone, String uf, String cidade, String endereco, Long numero, String bairro) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.uf = uf;
        this.cidade = cidade;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + ", uf=" + uf + ", cidade=" + cidade + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + '}';
    }
} 


