package Store;

import api.UserService;

import java.util.List;

public class User implements UserService
{
    private long id;
    private String login;
    private String password;

    public User(long id, String login, String password)
    {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public long getId()
    {
        return id;
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }
    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void addUser(User user)
    {

    }

    public List<User> getAllUsers()
    {
        return null;
    }

    public void removeUserById(long userId)
    {
    numbers.add(5);
    numbers.add(7);
    numbers.add(8);

    }
}
