package kodlamaioDorduncuGunOdev1.ders45_staticdemo;

public class ProductValidator {

    static {
        System.out.println("static yapici blok calisti.");
    }

    public ProductValidator() {
        System.out.println("yapici blok calisti.");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else return false;
    }

    public static class BaskaBirClass {
        public static void sil() {

        }
    }
}
