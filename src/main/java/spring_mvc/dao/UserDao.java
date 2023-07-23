package spring_mvc.dao;

import spring_mvc.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void save(User user);
    User getUser(Long id);
    void delete(Long id);
}
