package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.harga);
        /* tidak perlu memanggil toString(); */
        System.out.println(product);

        Product product2 = new Product("Macbook Pro", 30_000_000);
        System.out.println(product2);

        System.out.println(product == product2);
        System.out.println(product.equals(product2));

    }
}
