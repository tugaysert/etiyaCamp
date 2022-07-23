package kodlamaioDorduncuGunOdev1.ders45_staticdemo;

public class ProductManager {
    public void add(Product product) {
        if(ProductValidator.isValid(product)) {
            System.out.println("eklendi");
        }
        else System.out.println("urun bilgileri gecersizdir.");
    }
}
