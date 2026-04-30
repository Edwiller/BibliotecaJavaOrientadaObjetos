package modelo;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private String isbn;
    private Autor autor;
    private int quantidade_exemplar;

    public Livro(String titulo, int anoPublicacao, String isbn, Autor autor, int quantidade_exemplar) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido");
        }

        if (!isbn.matches("\\d+")) {
            throw new IllegalArgumentException("ISBN deve conter apenas números");
        }

        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.autor = autor;
        this.quantidade_exemplar = quantidade_exemplar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getQuantidadeExemplar() {
        return quantidade_exemplar;
    }

    public void setQuantidadeExemplar(int quantidade_exemplar) {
        this.quantidade_exemplar = quantidade_exemplar;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNome() + " | ISBN: " + isbn +
                " | Exemplares: " + quantidade_exemplar;
    }
}