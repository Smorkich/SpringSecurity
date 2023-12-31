package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface DaoUser {

    List<User> getUsers();

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    User getUserById(long id);

}
