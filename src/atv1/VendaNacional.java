package atv1;

public class VendaNacional extends Produto implements Venda {
    private double imposto;
    private int quantidade;

    public VendaNacional(double preco, String categoria, int estoque, String nome, double imposto, int quantidade) {
        super(preco, categoria, estoque, nome);
        this.imposto = imposto;
        this.quantidade = quantidade;
    }

    public double getImposto() { return imposto; }
    public int getQuantidade() { return quantidade; }

    // total da venda = preço x quantidade
    private double totalVenda() {
        return getPreco() * quantidade;
    }

    @Override
    public double calcularDesconto() {
        return totalVenda() * 0.10;
    }

    @Override
    public double calcularTotal() {
        return totalVenda() + imposto - calcularDesconto();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nImposto: R$ " + String.format("%.2f", imposto) +
                "\nQuantidade: " + quantidade;
    }
}
