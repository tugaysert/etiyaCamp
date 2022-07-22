package ucuncuGunOdev1.ders38_polymorphism;

public class CustomerManager {

    BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("musteri eklendi");
        this.logger.log(" : log mesaji");
    }


}
