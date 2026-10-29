package atv2;

public class Fatura implements Pagamento {
    private int numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(int numero, String descricao, int quantidade, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoItem(precoItem);
    }

    public int getNumero() { return numero; }
    public String getDescricao() { return descricao; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoItem() { return precoItem; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public void setQuantidade(int quantia) {
        this.quantidade = (quantia < 0) ? 0 : quantia;
    }

    public void setPrecoItem(double preco) {
        this.precoItem = (preco < 0) ? 0 : preco;
    }

    @Override
    public String toString() {
        return "Número: " + getNumero() +
                "\nDescrição: " + getDescricao() +
                "\nQuantidade: " + getQuantidade() +
                "\nPreço por item: R$ " + String.format("%.2f", getPrecoItem());
    }

    @Override
    public double getValorPagamento() {
        return quantidade * precoItem;
    }
}

