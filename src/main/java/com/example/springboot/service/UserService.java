package com.example.springboot.service;

import com.example.springboot.model.User;


import java.util.List;

public interface UserService {
   void save(User user);

   void updateUser(User updateUser);

   void removeUser(int id);

   User getUserById(int id);

   List<User> getAllUsers();
}


