package repository.abstracts;

import entities.concretes.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void add(User user);
    List<User> getAll();

    Optional<User> getUserById(int id);
    void deleteById(int id);
    void updateUser(User user);

}
