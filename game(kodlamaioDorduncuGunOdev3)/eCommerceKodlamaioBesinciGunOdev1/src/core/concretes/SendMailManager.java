package core.concretes;

import core.abstracts.SendMailService;
import entities.concretes.User;

public class SendMailManager implements SendMailService {
    @Override
    public void sendMail(User user) {
        System.out.println("dogrulama epostasi gonderildi");
    }
}
