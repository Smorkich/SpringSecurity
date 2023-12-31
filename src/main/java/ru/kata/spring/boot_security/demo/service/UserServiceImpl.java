package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.DaoUser;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final DaoUser daoUser;

    @Autowired
    public UserServiceImpl(DaoUser daoUser) {
        this.daoUser = daoUser;
    }

    @Override
    public List<User> getUsers() {
        return daoUser.getUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) {
         daoUser.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        daoUser.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        daoUser.updateUser(user);
    }

    @Override
    public User getUserById(long id) {
        return daoUser.getUserById(id);
    }
}
