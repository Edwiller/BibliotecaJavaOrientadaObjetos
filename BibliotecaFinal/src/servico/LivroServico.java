package servico;

import modelo.Livro;
import repositorio.LivroRepositorio;

public class LivroServico {

    private LivroRepositorio repo = new LivroRepositorio();

    public void cadastrar(Livro livro) {
        repo.salvar(livro);
        System.out.println("Livro cadastrado!");
    }

    public Livro buscar(String isbn) {
        return repo.buscarPorIsbn(isbn);
    }

    public void listar() {
        for (Livro l : repo.listarTodos()) {
            System.out.println(l);
        }
    }

    public void buscarPorAutor(String nome) {
        var lista = repo.buscarPorAutor(nome);

        for (Livro l : lista) {
            System.out.println(l);
        }
    }

    public void remover(String isbn) {
        repo.remover(isbn);
    }
}