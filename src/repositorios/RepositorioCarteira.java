package repositorios;

import entidades.Carteira;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCarteira implements IRepositorioCarteira {
    private List<Carteira> carteiras = new ArrayList<>();

    @Override
    public void cadastrar(Carteira carteira) {
        carteiras.add(carteira);
    }

    @Override
    public void remover(String id) {
        carteiras.removeIf(c -> c.getIdUsuario().equals(id));
    }

    @Override
    public Carteira buscar(String id) {
        for (Carteira carteira : carteiras) {
            if (carteira.getIdUsuario().equals(id)) {
                return carteira;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Carteira carteira) {
        for (int i = 0; i < carteiras.size(); i++) {
            if (carteiras.get(i).getIdUsuario().equals(carteira.getIdUsuario())) {
                carteiras.set(i, carteira);
                break;
            }
        }
    }

    @Override
    public List<Carteira> listar() {
        return new ArrayList<>(carteiras);
    }
}