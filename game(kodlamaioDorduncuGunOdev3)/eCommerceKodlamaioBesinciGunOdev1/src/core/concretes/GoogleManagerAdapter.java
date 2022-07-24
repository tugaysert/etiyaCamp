package core.concretes;

import GoogleReference.GoogleManager;
import core.abstracts.MailCheckService;

public class GoogleManagerAdapter implements MailCheckService {
    @Override
    public void checkIfMailExist(String mail) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.checkIfGmailExists(mail);
    }
}
