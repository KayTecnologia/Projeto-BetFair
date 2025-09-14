package entidades;

public class Carteira {
    private String idUsuario;
    private double saldo;

    // Construtor 1: Completo
    public Carteira(String idUsuario, double saldo) {
        this.idUsuario = idUsuario;
        this.saldo = saldo;
    }

    // Construtor 2: Sem saldo
    public Carteira(String idUsuario) {
        this.idUsuario = idUsuario;
        this.saldo = 0.0;
    }

    // Construtor 3: Vazio
    public Carteira() {
        this.idUsuario = "0";
        this.saldo = 0.0;
    }

    // Getters e Setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Sobrecarga de método
    public String adicionarFundos(double valor) {
        saldo += valor;
        return "Adicionado R$" + valor + ". Novo saldo: R$" + saldo;
    }

    public String adicionarFundos(double valor, String motivo) {
        saldo += valor;
        return "Adicionado R$" + valor + " (" + motivo + "). Novo saldo: R$" + saldo;
    }
}