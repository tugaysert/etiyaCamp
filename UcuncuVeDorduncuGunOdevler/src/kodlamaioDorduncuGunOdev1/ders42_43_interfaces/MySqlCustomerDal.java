package kodlamaioDorduncuGunOdev1.ders42_43_interfaces;

public class MySqlCustomerDal implements ICustomerDal {


    @Override
    public void add() {
        System.out.println("MySql'e eklendi.");
    }
}
