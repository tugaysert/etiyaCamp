package business.concretes;

import business.abstracts.UserService;
import core.abstracts.MailCheckService;
import core.abstracts.SendMailService;
import core.patterns.RegexMatches;
import entities.concretes.User;
import repository.abstracts.UserDao;

import java.util.List;
import java.util.Optional;

public class UserManager implements UserService {

    private final UserDao userDao;
    private final RegexMatches regexMatches;
    private final MailCheckService mailCheckService;
    private final SendMailService sendMailService;

    public UserManager(UserDao userDao, RegexMatches regexMatches, MailCheckService mailCheckService, SendMailService sendMailService) {
        this.userDao = userDao;
        this.regexMatches = regexMatches;
        this.mailCheckService = mailCheckService;
        this.sendMailService = sendMailService;
    }

    @Override
    public void add(User user) {
        if (regexMatches.namePattern(user.getFirstName()) && regexMatches.namePattern(user.getLastName())) ;
        else {
            System.out.println("ad veya soyad en az iki karakter olmali.");
            return;
        }

        if (regexMatches.emailPattern(user.getEmail())) ;
        else {
            System.out.println("email uygun degil");
            return;
        }

        if (!checkIfEmailExist(user.getEmail())) ;
        else {
            System.out.println("email zaten kullaniliyor");
            return;
        }

        if (regexMatches.passwordPattern(user.getPassword())) {
            userDao.add(user);
            System.out.println("user eklendi");
            sendMailService.sendMail(user);
        } else {
            System.out.println("sifre en az 6 karakter olmali.");
        }

    }

    @Override
    public void delete(User user) {
        userDao.deleteById(user.getId());
    }

    @Override
    public void update(User user) {
        userDao.updateUser(user);
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    @Override
    public void loginCheck(String email, String password) {
        boolean result = getAllUsers().stream()
                .anyMatch(user -> user.getEmail().equals(email) && user.getPassword().equals(password));
        if (result) System.out.println("giris basarili");
        else System.out.println("giris basarisiz");

    }

    @Override
    public void loginWithGoogle(String email) {
        mailCheckService.checkIfMailExist(email);
    }

    private boolean checkIfEmailExist(String email) {
        return userDao.getAll().stream()
                .anyMatch(user -> user.getEmail().equals(email));
    }
}
