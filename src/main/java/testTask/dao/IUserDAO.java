package testTask.dao;

import testTask.model.User;

import java.util.List;

public interface IUserDAO {

    List<User> allUsers();

    void create(User user);

    User read(long id);

    void update(User user);

    void delete(User user);

}
