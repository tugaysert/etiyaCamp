package core.abstracts;

import entities.concretes.User;

public interface SendMailService {
    void sendMail(User user);

}
