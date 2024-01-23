package com.application.service;

import java.util.List;
import java.util.Optional;

import com.application.entity.User;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long userId);

    User createUser(User user);

    User updateUser(Long userId, User updatedUser);

    boolean deleteUser(Long userId);
}