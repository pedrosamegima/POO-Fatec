package atv1;

public class TesteProduto {
    public static void main(String[] args) {
        VendaNacional vn = new VendaNacional(3500.00, "Informática", 20, "Notebook", 150.00, 2);
        VendaInternacional vi = new VendaInternacional(2000.00, "Eletrônicos", 15, "Smartphone", 300.00, 120.00, 3);

        System.out.println("=== Venda Nacional ===");
        System.out.printf("Desconto: R$ %.2f%n", vn.calcularDesconto());
        System.out.printf("Total: R$ %.2f%n", vn.calcularTotal());

        System.out.println("\n=== Venda Internacional ===");
        System.out.printf("Desconto: R$ %.2f%n", vi.calcularDesconto());
        System.out.printf("Total: R$ %.2f%n", vi.calcularTotal());

        System.out.println("\n--- Atributos (Venda Nacional) ---");
        System.out.println(vn.toString());

        System.out.println("\n--- Atributos (Venda Internacional) ---");
        System.out.println(vi.toString());
    }
}