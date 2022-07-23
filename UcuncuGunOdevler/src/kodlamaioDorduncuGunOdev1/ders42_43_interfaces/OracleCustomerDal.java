package kodlamaioDorduncuGunOdev1.ders42_43_interfaces;

public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Oracle'a eklendi.");
    }
}
