package com.restaurant.restaurantmanagementsystem.controller;

import com.restaurant.restaurantmanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public boolean login(@RequestParam String username, @RequestParam String password) {
        return service.validateCredentials(username, password);
    }

    @GetMapping("/isAdmin/{username}")
    public boolean isAdmin(@PathVariable String username) {
        return service.isAdmin(username);
    }

    @PostMapping
    public void addUser(@RequestParam String username,
                        @RequestParam String password,
                        @RequestParam String role) {
        service.addUser(username, password, role);
    }

    @DeleteMapping("/{username}")
    public void delete(@PathVariable String username) {
        service.deleteUser(username);
    }
}

