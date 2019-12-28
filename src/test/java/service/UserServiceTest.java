package service;

import Store.User;
import api.UserService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest
{
    @Test
    public void testGetAllUsers()
    {
        List<User>users = new ArrayList<User>();
        users.add(new User,"admin", "admin");
        users.add(new User, "pablo", "admin");

        UserServiceImpl usersService = new UserServiceImpl(users);
        List<User>usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users,usersFromTestClass);
    }

    @Test
    public void testAddUser()
    {
        List<User>users = new ArrayList<User>();
        User user = new User(1l,"admin","admin");
        users.add(user);

        UserServiceImpl userService = new UserServiceImpl();
        userService.add(user);
        List<User>usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testRemoveUser()
    {
        List<User>users = new ArrayList<User>();

        User admin = new User(1l, "admin", "admin");
        User pablo = new User(2l, "pablo", "admin");
        users.add(admin);
        users.add(pablo);

        UserServiceImpl userService = UserServiceImpl(users);
        userService.removeUserById(user);
        users.remove(admin);
        List<User>usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users,usersFromTestClass);
    }

}
