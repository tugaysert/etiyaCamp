public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "kalem");
        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);

    }
}
