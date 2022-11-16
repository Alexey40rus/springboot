package com.example.springboot.dao;

import com.example.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void save(User user);

    void updateUser(User updateUser);

    void removeUser(int id);

    User getUserById(int id);
}
