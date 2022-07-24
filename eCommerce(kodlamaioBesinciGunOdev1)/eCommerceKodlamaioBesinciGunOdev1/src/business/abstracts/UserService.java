package business.abstracts;

import entities.concretes.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void add(User user);
    void delete(User user);
    void update(User user);
    Optional<User> getUserById(int id);
    List<User> getAllUsers();
    void loginCheck(String email, String password);
    void loginWithGoogle(String email);
}
