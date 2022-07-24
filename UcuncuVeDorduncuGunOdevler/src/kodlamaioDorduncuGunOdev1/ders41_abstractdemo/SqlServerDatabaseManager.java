package kodlamaioDorduncuGunOdev1.ders41_abstractdemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Sql serverdan veri getirildi.");
    }
}
