public class Main {
    public static void main(String[] args) {
        Product p = new Product("Keyboard", 1500);
        System.out.println(p.getName());
        System.out.println(p.priceWithVat(0.15));
    }
}
