package ivanov.springboot.SpringBootApp.service;

import ivanov.springboot.SpringBootApp.model.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);
}
