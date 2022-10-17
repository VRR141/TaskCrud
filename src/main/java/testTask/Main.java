package testTask;

import testTask.service.IUserService;
import testTask.service.UserServiceImpl;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        System.out.println(userService.allUsers());
    }
}
