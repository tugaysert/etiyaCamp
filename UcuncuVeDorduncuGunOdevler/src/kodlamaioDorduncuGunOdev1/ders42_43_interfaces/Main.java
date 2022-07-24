package kodlamaioDorduncuGunOdev1.ders42_43_interfaces;



public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

    }
}
