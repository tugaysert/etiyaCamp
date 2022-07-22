package ikinciGunOdev2.ders31_34;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(4000);
        product.setStockAmount(2);

        Product product2 = new Product(2,"Laptop", "Asus Laptop", 3000, 2, "Siyah");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product2);
        System.out.println(product.getKod());

    }

}