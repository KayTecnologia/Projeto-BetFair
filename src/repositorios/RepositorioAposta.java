package repositorios;

import entidades.Aposta;
import java.util.ArrayList;
import java.util.List;

public class RepositorioAposta implements IRepositorioAposta {
    private List<Aposta> apostas = new ArrayList<>();

    @Override
    public void cadastrar(Aposta aposta) {
        apostas.add(aposta);
    }

    @Override
    public void remover(String id) {
        apostas.removeIf(a -> a.getIdAposta().equals(id));
    }

    @Override
    public Aposta buscar(String id) {
        for (Aposta aposta : apostas) {
            if (aposta.getIdAposta().equals(id)) {
                return aposta;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Aposta aposta) {
        for (int i = 0; i < apostas.size(); i++) {
            if (apostas.get(i).getIdAposta().equals(aposta.getIdAposta())) {
                apostas.set(i, aposta);
                break;
            }
        }
    }

    @Override
    public List<Aposta> listar() {
        return new ArrayList<>(apostas);
    }
}