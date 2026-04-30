package repositorio;

import modelo.Usuario;
import java.util.*;

public class UsuarioRepositorio {

    private Map<String, Usuario> usuarios = new HashMap<>();

    public void salvar(Usuario usuario) {
        if (usuarios.containsKey(usuario.getCpf())) {
            System.out.println("CPF já cadastrado!");
            return;
        }
        usuarios.put(usuario.getCpf(), usuario);
    }

    public Usuario buscar(String cpf) {
        return usuarios.get(cpf);
    }

    public Collection<Usuario> listar() {
        return usuarios.values();
    }

    public void remover(String cpf) {
        usuarios.remove(cpf);
    }
}