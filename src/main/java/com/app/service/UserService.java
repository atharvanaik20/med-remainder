package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.User;

public interface UserService {
    void registerUser(User user);
    User findByUsername(String username);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
