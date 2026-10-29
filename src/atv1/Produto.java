package atv1;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;

    public Produto(double preco, String categoria, int estoque, String nome) {
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nCategoria: " + categoria +
                "\nPreço: R$ " + String.format("%.2f", preco) +
                "\nEstoque: " + estoque;
    }
}
