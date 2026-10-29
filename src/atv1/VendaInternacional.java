package atv1;

public class VendaInternacional extends Produto implements Venda {
    private double taxaImportacao;
    private double frete;
    private int quantidade;

    public VendaInternacional(double preco, String categoria, int estoque, String nome,
                              double taxaImportacao, double frete, int quantidade) {
        super(preco, categoria, estoque, nome);
        this.taxaImportacao = taxaImportacao;
        this.frete = frete;
        this.quantidade = quantidade;
    }

    public double getTaxaImportacao() { return taxaImportacao; }
    public double getFrete() { return frete; }
    public int getQuantidade() { return quantidade; }

    // total da venda = preço x quantidade
    private double totalVenda() {
        return getPreco() * quantidade;
    }

    @Override
    public double calcularDesconto() {
        return totalVenda() * 0.05;
    }

    @Override
    public double calcularTotal() {
        return totalVenda() + taxaImportacao + frete - calcularDesconto();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTaxa de importação: R$ " + String.format("%.2f", taxaImportacao) +
                "\nFrete: R$ " + String.format("%.2f", frete) +
                "\nQuantidade: " + quantidade;
    }
}