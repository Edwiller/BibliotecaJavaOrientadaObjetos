package repositorio;

import modelo.Livro;
import java.util.*;

public class LivroRepositorio {

    private Map<String, Livro> livros = new HashMap<>();

    public void salvar(Livro livro) {
        if (livros.containsKey(livro.getIsbn())) {
            System.out.println("ISBN já cadastrado!");
            return;
        }
        livros.put(livro.getIsbn(), livro);
    }

    public Livro buscarPorIsbn(String isbn) {
        return livros.get(isbn);
    }

    public Collection<Livro> listarTodos() {
        return livros.values();
    }

    public void remover(String isbn) {
        livros.remove(isbn);
    }

    public List<Livro> buscarPorAutor(String nomeAutor) {
        List<Livro> lista = new ArrayList<>();

        for (Livro l : livros.values()) {
            if (l.getAutor().getNome().equalsIgnoreCase(nomeAutor)) {
                lista.add(l);
            }
        }

        return lista;
    }
}