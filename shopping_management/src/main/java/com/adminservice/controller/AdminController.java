package com.adminservice.controller;

import com.adminservice.entity.User;
import com.adminservice.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/admin/users")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // GET ALL USERS
    @GetMapping
    public List<User> getAllUsers() {
        return adminService.getAllUsers();
    }

    // CREATE USER
    @PostMapping
    public User createUser(@RequestBody User user) {
        return adminService.createUser(user);
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return adminService.getUserById(id);
    }
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return adminService.updateUser(id, user);
    }


}
