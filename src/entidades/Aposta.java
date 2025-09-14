package entidades;

public class Aposta {
    private String idAposta;
    private String idUsuario;
    private String idEvento;
    private double valor;
    private String resultadoEscolhido;

    // Construtor 1: Completo
    public Aposta(String idAposta, String idUsuario, String idEvento, double valor, String resultadoEscolhido) {
        this.idAposta = idAposta;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.valor = valor;
        this.resultadoEscolhido = resultadoEscolhido;
    }

    // Construtor 2: Sem resultado
    public Aposta(String idAposta, String idUsuario, String idEvento, double valor) {
        this(idAposta, idUsuario, idEvento, valor, "Não definido");
    }

    // Construtor 3: Apenas com ID
    public Aposta(String idAposta) {
        this.idAposta = idAposta;
        this.idUsuario = "0";
        this.idEvento = "0";
        this.valor = 0.0;
        this.resultadoEscolhido = "Não definido";
    }

    // Getters e Setters
    public String getIdAposta() {
        return idAposta;
    }

    public void setIdAposta(String idAposta) {
        this.idAposta = idAposta;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getResultadoEscolhido() {
        return resultadoEscolhido;
    }

    public void setResultadoEscolhido(String resultadoEscolhido) {
        this.resultadoEscolhido = resultadoEscolhido;
    }

    // Sobrecarga de método
    public String detalhesAposta() {
        return "Aposta ID: " + idAposta + ", Valor: R$" + valor;
    }

    public String detalhesAposta(boolean incluirUsuario) {
        if (incluirUsuario) {
            return "Aposta ID: " + idAposta + ", Usuário ID: " + idUsuario + ", Valor: R$" + valor;
        }
        return detalhesAposta();
    }
}