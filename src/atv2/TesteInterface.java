package atv2;

public class TesteInterface {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[4];

        pagamentos[0] = new Fatura(1001, "Teclado mecânico", 3, 250.00);
        pagamentos[1] = new Fatura(1002, "Monitor 24 polegadas", 2, 900.00);
        pagamentos[2] = new FuncionarioMensalista("Ana", "Silva", "123.456.789-00", 4500.00);
        pagamentos[3] = new FuncionarioMensalista("Carlos", "Souza", "987.654.321-00", 5200.00);

        for (Pagamento p : pagamentos) {
            System.out.println(p.toString());
            System.out.printf("Valor do pagamento: R$ %.2f%n", p.getValorPagamento());
            System.out.println("------------------------------");
        }
    }
}
