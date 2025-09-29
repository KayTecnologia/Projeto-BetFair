package entidades;

public abstract class Participante {
    private String nome;
    private String id;

    // Construtor 1: Completo
    public Participante(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    // Construtor 2: Apenas com ID
    public Participante(String id) {
        this.id = id;
        this.nome = "Desconhecido";
    }

    // Construtor 3: Vazio
    public Participante() {
        this.nome = "Sem Nome";
        this.id = "0";
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Método abstrato
    public abstract String exibirInformacoes();

    // Sobrecarga de método
    public String registrarAcao() {
        return "Ação registrada por " + nome;
    }

    public String registrarAcao(String detalhes) {
        return "Ação registrada por " + nome + ": " + detalhes;
    }
}