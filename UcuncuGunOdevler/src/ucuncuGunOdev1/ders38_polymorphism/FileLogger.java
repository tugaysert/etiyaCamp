package ucuncuGunOdev1.ders38_polymorphism;

public class FileLogger extends BaseLogger{

    @Override
    public void log(String message) {
        System.out.println("File'e loglandi " + message);
    }
}
