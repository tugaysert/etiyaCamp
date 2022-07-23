package kodlamaioDorduncuGunOdev1.ders41_abstractdemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("MySql veritabanindan getirildi.");
    }
}
