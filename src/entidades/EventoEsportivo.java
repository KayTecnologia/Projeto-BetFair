package entidades;

public class EventoEsportivo {
    private String idEvento;
    private String nomeEvento;
    private String data;
    private String esporte;

    // Construtor 1: Completo
    public EventoEsportivo(String idEvento, String nomeEvento, String data, String esporte) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.esporte = esporte;
    }

    // Construtor 2: Sem esporte
    public EventoEsportivo(String idEvento, String nomeEvento, String data) {
        this(idEvento, nomeEvento, data, "Não especificado");
    }

    // Construtor 3: Apenas com ID
    public EventoEsportivo(String idEvento) {
        this.idEvento = idEvento;
        this.nomeEvento = "Evento Desconhecido";
        this.data = "01/01/2025";
        this.esporte = "Não especificado";
    }

    // Getters e Setters
    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    // Sobrecarga de método
    public String exibirEvento() {
        return "Evento: " + nomeEvento + ", Data: " + data;
    }

    public String exibirEvento(boolean incluirEsporte) {
        if (incluirEsporte) {
            return "Evento: " + nomeEvento + ", Data: " + data + ", Esporte: " + esporte;
        }
        return exibirEvento();
    }
}