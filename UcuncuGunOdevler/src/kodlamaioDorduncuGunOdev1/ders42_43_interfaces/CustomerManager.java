package kodlamaioDorduncuGunOdev1.ders42_43_interfaces;

public class CustomerManager {
    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void add() {
        iCustomerDal.add();
    }
}
