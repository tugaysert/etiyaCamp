package kodlamaioDorduncuGunOdev1.ders45_staticdemo;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager =  new ProductManager();
        product.name = "Mahmut";
        product.price = 500;
        productManager.add(product);

        DatabaseHelper.Crud.update();
        DatabaseHelper.Connection.createConnection();
    }
}
