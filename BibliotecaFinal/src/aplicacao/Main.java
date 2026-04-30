package aplicacao;

import modelo.*;
import servico.*;

import java.util.Scanner;

public class Main {

    static LivroServico livroServico = new LivroServico();
    static UsuarioServico usuarioServico = new UsuarioServico();
    static EmprestimoServico emprestimoServico = new EmprestimoServico();

    public static void menu() {
        System.out.println("\n1 - Cadastrar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Cadastrar usuário");
        System.out.println("4 - Listar usuários");
        System.out.println("5 - Emprestar livro");
        System.out.println("0 - Sair");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            menu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:

                    boolean sucessoLivro = false;

                    while (!sucessoLivro) {
                        try {
                            System.out.print("Título: ");
                            String titulo = sc.nextLine();

                            System.out.print("Autor: ");
                            String nomeAutor = sc.nextLine();

                            Autor autor = new Autor(nomeAutor, "BR", "2000", "000", "email");

                            System.out.print("ISBN: ");
                            String isbn = sc.nextLine();

                            Livro livro = new Livro(titulo, 2024, isbn, autor, 5);
                            livroServico.cadastrar(livro);

                            sucessoLivro = true;

                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                            System.out.println("Tente novamente.\n");
                        }
                    }

                    break;

                case 2:
                    livroServico.listar();
                    break;

                case 3:

                    boolean sucesso = false;

                    while (!sucesso) {
                        try {
                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            System.out.print("CPF: ");
                            String cpf = sc.nextLine();

                            System.out.print("Email: ");
                            String email = sc.nextLine();

                            Usuario usuario = new Usuario(nome, cpf, email);
                            usuarioServico.cadastrar(usuario);

                            sucesso = true; // sai do loop

                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                            System.out.println("Tente novamente.\n");
                        }
                    }

                    break;

                case 4:
                    usuarioServico.listar();
                    break;

                case 5:
                    System.out.print("ISBN: ");
                    String isbnEmp = sc.nextLine();

                    Livro l = livroServico.buscar(isbnEmp);

                    System.out.print("CPF do usuário: ");
                    String cpfEmp = sc.nextLine();

                    Usuario u = usuarioServico.buscar(cpfEmp);

                    emprestimoServico.emprestar(l, u);
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}