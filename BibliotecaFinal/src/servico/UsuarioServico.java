package servico;

import modelo.Usuario;
import repositorio.UsuarioRepositorio;

public class UsuarioServico {

    private UsuarioRepositorio repo = new UsuarioRepositorio();

    public void cadastrar(Usuario usuario) {
        repo.salvar(usuario);
        System.out.println("Usuário cadastrado!");
    }

    public Usuario buscar(String cpf) {
        return repo.buscar(cpf);
    }

    public void listar() {
        for (Usuario u : repo.listar()) {
            System.out.println(u);
        }
    }

    public void remover(String cpf) {
        repo.remover(cpf);
    }
}