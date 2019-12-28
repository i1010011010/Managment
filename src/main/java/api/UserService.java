package api;

import Store.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService
{
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);








}
