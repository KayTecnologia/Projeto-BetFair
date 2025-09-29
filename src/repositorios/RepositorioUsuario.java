package repositorios;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuario implements RepositorioInterface<Usuario>, IRepositorioUsuario {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void cadastrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void remover(String id) {
        usuarios.removeIf(u -> u.getId().equals(id));
    }

    @Override
    public Usuario buscar(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(usuario.getId())) {
                usuarios.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }
}