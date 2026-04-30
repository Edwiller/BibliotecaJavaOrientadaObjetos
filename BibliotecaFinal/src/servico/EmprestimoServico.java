package servico;

import modelo.*;
import java.util.*;

public class EmprestimoServico {

    private List<Emprestimo> historico = new ArrayList<>();

    public void emprestar(Livro livro, Usuario usuario) {

        if (livro == null || usuario == null) {
            System.out.println("Livro ou usuário não encontrado!");
            return;
        }

        if (livro.getQuantidadeExemplar() <= 1) {
            System.out.println("Não é possível emprestar.");
            return;
        }

        livro.setQuantidadeExemplar(livro.getQuantidadeExemplar() - 1);

        Emprestimo e = new Emprestimo(livro, usuario);
        historico.add(e);

        System.out.println("Empréstimo realizado!");
    }

    public void listarEmprestados() {
        for (Emprestimo e : historico) {
            if (e.estaAtivo()) {
                System.out.println(e);
            }
        }
    }
}