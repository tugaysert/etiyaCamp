import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.GoogleManagerAdapter;
import core.concretes.SendMailManager;
import core.patterns.RegexMatches;
import entities.concretes.User;
import repository.concretes.UserRepository;
import ui.Login;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Tugay", "Sert", "tugaysert@gmail.com", "123450");
        UserService userService = new UserManager(new UserRepository(),
                new RegexMatches(),
                new GoogleManagerAdapter(),
                new SendMailManager());

        userService.add(user);
        userService.getAllUsers();
        Login login = new Login(userService);
        login.loginWithGoogle(user.getEmail());
    }
}
