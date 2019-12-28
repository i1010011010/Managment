package api;

import Store.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService
{
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(long userId);


    List<Integer>numbers = new ArrayList<Integer>();

    numbers.add(5);



}
