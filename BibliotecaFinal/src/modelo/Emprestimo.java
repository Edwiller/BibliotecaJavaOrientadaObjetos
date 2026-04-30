package modelo;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
        livro.setQuantidadeExemplar(livro.getQuantidadeExemplar() + 1);
    }

    public boolean estaAtivo() {
        return dataDevolucao == null;
    }

    @Override
    public String toString() {
        return usuario + " pegou " + livro.getTitulo() +
            " em " + dataEmprestimo;
    }
}