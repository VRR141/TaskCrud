package testTask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testTask.dao.IUserDAO;
import testTask.dao.UserDAOImpl;
import testTask.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService{

    private IUserDAO userDAO;

    @Autowired
    public void setUserDAO(IUserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Override
    public User read(long id) {
        return userDAO.read(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }
}
