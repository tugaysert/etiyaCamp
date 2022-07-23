package kodlamaioDorduncuGunOdev1.ders41_abstractdemo;

public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;

    public CustomerManager() {

    }

    public void getCustomers() {
        baseDatabaseManager.getData();
    }
}
