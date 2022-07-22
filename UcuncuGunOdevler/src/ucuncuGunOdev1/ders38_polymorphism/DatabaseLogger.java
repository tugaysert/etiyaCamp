package ucuncuGunOdev1.ders38_polymorphism;

public class DatabaseLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("Database'e loglandi " + message);
    }
}
