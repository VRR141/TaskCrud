package testTask.dao;

import org.springframework.stereotype.Repository;
import testTask.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
@Repository
public class UserDAOImpl implements IUserDAO{

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Long, User> users = new HashMap<>();

    static {
        User user0 = new User();
        user0.setId(AUTO_ID.getAndIncrement());
        user0.setFirstname("Vladislav");
        user0.setSurname("Ryazantsev");
        user0.setPatronymic("Romanovich");
        user0.setDateOfBirth("1995/11/14");
        user0.setEmail("v.r.ryazantsev@gmail.com");
        user0.setPhoneNumber("+7 981 688 76 90");
        users.put(user0.getId(), user0);

        User user1 = new User();
        user1.setId(AUTO_ID.getAndIncrement());
        user1.setFirstname("2name");
        user1.setSurname("2surname");
        user1.setPatronymic("2patronymic");
        user1.setDateOfBirth("1988/8/25");
        user1.setEmail("@gmail.com");
        user1.setPhoneNumber("900");
        users.put(user1.getId(), user1);

        User user2 = new User();
        user2.setId(AUTO_ID.getAndIncrement());
        user2.setFirstname("3name");
        user2.setSurname("3surname");
        user2.setPatronymic("3patrnymic");
        user2.setDateOfBirth("1976/1/22");
        user2.setEmail("@mail.ru");
        user2.setPhoneNumber("8 800");
        users.put(user2.getId(), user2);

        User user3 = new User();
        user3.setId(AUTO_ID.getAndIncrement());
        user3.setFirstname("4name");
        user3.setSurname("4surname");
        user3.setPatronymic("4patronymic");
        user3.setDateOfBirth("1972/2/4");
        user3.setEmail("@bk.ru");
        user3.setPhoneNumber("no mobile");
        users.put(user3.getId(), user3);
    }
    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void create(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.getId(), user);
    }

    @Override
    public User read(long id) {
        return users.get(id);
    }

    @Override
    public void update(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }
}
