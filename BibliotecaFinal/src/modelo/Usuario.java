package modelo;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        if (!cpf.matches("\\d+")) {
            throw new IllegalArgumentException("CPF inválido");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ") (EMAIL: " + email + ")";
    }
}