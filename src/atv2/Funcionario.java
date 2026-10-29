package atv2;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Funcionario(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public String getCpf() { return cpf; }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nSobrenome: " + getSobrenome() +
                "\nCPF: " + getCpf();
    }
}

