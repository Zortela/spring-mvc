package web.service;


import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAllUsers();
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
