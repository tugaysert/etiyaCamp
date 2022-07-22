package ucuncuGunOdev1.ders38_polymorphism;

public class ConsoleLogger extends BaseLogger{

    @Override
    public void log(String message) {
        System.out.println("Console loglandi " + message);
    }
}
