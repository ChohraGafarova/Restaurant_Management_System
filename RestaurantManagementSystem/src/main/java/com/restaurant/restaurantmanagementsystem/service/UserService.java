package com.restaurant.restaurantmanagementsystem.service;

import com.restaurant.restaurantmanagementsystem.entity.UserEntity;
import com.restaurant.restaurantmanagementsystem.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public boolean validateCredentials(String username, String password) {
        logger.info("Validating credentials for user: {}", username);
        return repo.findByUsernameAndPassword(username, password).isPresent();
    }

    public boolean isAdmin(String username) {
        logger.info("Checking admin role for user: {}", username);
        return repo.findByUsername(username)
                .map(u -> "Administrator".equalsIgnoreCase(u.getRole()))
                .orElse(false);
    }

    public void addUser(String username, String password, String role) {
        logger.info("Adding user: {}", username);
        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        repo.save(user);
    }

    public void deleteUser(String username) {
        logger.warn("Deleting user: {}", username);
        repo.findByUsername(username).ifPresent(repo::delete);
    }
}
