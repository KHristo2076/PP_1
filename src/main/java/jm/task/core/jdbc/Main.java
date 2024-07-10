package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Khristo", "Bostandzhyan", (byte) 27);
        userService.saveUser("Spartak", "Shatalov", (byte) 27);
        userService.saveUser("Stepan", "Karnauhov", (byte) 36);
        userService.saveUser("Petr", "Ivanov", (byte) 42);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
