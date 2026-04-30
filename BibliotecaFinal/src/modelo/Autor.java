package modelo;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String dataNascimento;
    private String cpf;
    private String email;

    public Autor(String nome, String nacionalidade, String dataNascimento, String cpf, String email) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public String getNacionalidade(){ return nacionalidade; }
    public void setNacionalidade(String nacionalidade){ this.nacionalidade = nacionalidade; }

    public String getDataNascimento(){ return dataNascimento; }
    public void setDataNascimento(String dataNascimento){ this.dataNascimento = dataNascimento; }

    public String getCpf(){ return cpf; }
    public void setCpf(String cpf){ this.cpf = cpf; }

    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
}