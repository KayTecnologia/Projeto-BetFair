package repositorios;

import entidades.EventoEsportivo;
import java.util.ArrayList;
import java.util.List;

public class RepositorioEventoEsportivo implements IRepositorioEventoEsportivo {
    private List<EventoEsportivo> eventos = new ArrayList<>();

    @Override
    public void cadastrar(EventoEsportivo evento) {
        eventos.add(evento);
    }

    @Override
    public void remover(String id) {
        eventos.removeIf(e -> e.getIdEvento().equals(id));
    }

    @Override
    public EventoEsportivo buscar(String id) {
        for (EventoEsportivo evento : eventos) {
            if (evento.getIdEvento().equals(id)) {
                return evento;
            }
        }
        return null;
    }

    @Override
    public void atualizar(EventoEsportivo evento) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getIdEvento().equals(evento.getIdEvento())) {
                eventos.set(i, evento);
                break;
            }
        }
    }

    @Override
    public List<EventoEsportivo> listar() {
        return new ArrayList<>(eventos);
    }
}