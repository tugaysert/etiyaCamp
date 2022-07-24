package repository.concretes;

import entities.concretes.User;
import repository.abstracts.UserDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements UserDao {

    private final List<User> users = new ArrayList<>();


    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public Optional<User> getUserById(int id) {
        return users.stream()
                .filter(user -> user.getId()==id)
                .findAny();
    }

    @Override
    public void deleteById(int id) {
        getUserById(id).ifPresent(users::remove);
    }

    @Override
    public void updateUser(User user) {
        Optional<User> updatedUser;
        updatedUser = getUserById(user.getId());
        updatedUser.ifPresent(u ->{
            u.setFirstName(u.getFirstName());
            u.setLastName(u.getLastName());
            u.setEmail(u.getEmail());
            u.setPassword(u.getPassword());
        });

    }
}
