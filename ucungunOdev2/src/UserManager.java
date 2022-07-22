public class UserManager {

    public void login(User user) {
        System.out.println(user.getName() + " login oldu. ");
    }

    public void add(User user) {
        System.out.println(user.getName() + " eklendi. ");
    }

    public void update(User user) {
        System.out.println(user.getName() + " guncellendi. ");
    }

    public void delete(User user) {
        System.out.println(user.getName() + " silindi. ");
    }


}

