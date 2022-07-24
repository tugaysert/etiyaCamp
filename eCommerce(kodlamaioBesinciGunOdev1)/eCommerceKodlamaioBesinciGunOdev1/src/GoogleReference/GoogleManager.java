package GoogleReference;

public class GoogleManager {
    public void checkIfGmailExists(String email)
    {
        if(email.contains("gmail"))
        {
            System.out.println("google ile giris yapildi");
        }
        else
            System.out.println("google ile giris yapilamadi");
    }
}
