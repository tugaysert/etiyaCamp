package kodlamaioUcuncuGunOdev1.ders38_polymorphism;

public class EmailLogger extends BaseLogger{

    @Override
    public void log(String message) {
        System.out.println("Email'e loglandi " + message);
    }
}
