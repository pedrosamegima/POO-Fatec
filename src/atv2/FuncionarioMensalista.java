package atv2;

public class FuncionarioMensalista  extends Funcionario implements Pagamento {
    private double salarioMensal;

    public FuncionarioMensalista(String nome, String sobrenome, String cpf, double salarioMensal) {
        super(nome, sobrenome, cpf);
        setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() { return salarioMensal; }

    public void setSalarioMensal(double salario) {
        this.salarioMensal = (salario < 0) ? 0 : salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalário mensal: R$ " + String.format("%.2f", getSalarioMensal());
    }

    @Override
    public double getValorPagamento() {
        return getSalarioMensal();
    }
}
