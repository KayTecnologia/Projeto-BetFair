package repositorios;

import entidades.Participante;
import java.util.ArrayList;
import java.util.List;

public class RepositorioParticipante implements RepositorioInterface<Participante> {
    private List<Participante> participantes = new ArrayList<>();

    @Override
    public void cadastrar(Participante p) {
        participantes.add(p);
    }

    @Override
    public void remover(String id) {
        participantes.removeIf(participante -> participante.getId().equals(id));
    }

    @Override
    public Participante buscar(String id) {
        for (Participante participante : participantes) {
            if (participante.getId().equals(id)) {
                return participante;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Participante p) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).getId().equals(p.getId())) {
                participantes.set(i, p);
                break;
            }
        }
    }

    @Override
    public List<Participante> listar() {
        return new ArrayList<>(participantes);
    }
}
