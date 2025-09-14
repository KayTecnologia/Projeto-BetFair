package entidades;

public class Usuario extends Participante {
    private String email;
    private int idade;

    // Construtor 1: Completo
    public Usuario(String nome, String id, String email, int idade) {
        super(nome, id);
        this.email = email;
        this.idade = idade;
    }

    // Construtor 2: Sem idade
    public Usuario(String nome, String id, String email) {
        super(nome, id);
        this.email = email;
        this.idade = 18;
    }

    // Construtor 3: Apenas com ID
    public Usuario(String id) {
        super(id);
        this.email = "sem@email.com";
        this.idade = 18;
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Implementação do método abstrato
    @Override
    public String exibirInformacoes() {
        return "Usuário: " + getNome() + ", ID: " + getId() + ", Email: " + email + ", Idade: " + idade;
    }

    // Sobrecarga de método
    public String fazerAposta() {
        return "Aposta realizada por " + getNome();
    }

    public String fazerAposta(double valor) {
        return "Aposta de R$" + valor + " realizada por " + getNome();
    }
}