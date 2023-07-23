package spring_mvc.service;

import spring_mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);
    User getUser(Long id);
    void delete(Long id);
}
