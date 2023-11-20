package ivanov.springboot.SpringBootApp.dao;



import ivanov.springboot.SpringBootApp.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    void saveUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);

}
