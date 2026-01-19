package com.adminservice.serviceimpl;



import java.util.List;

import org.springframework.stereotype.Service;

import com.adminservice.entity.User;
import com.adminservice.repository.UserRepository;
import com.adminservice.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    private final UserRepository userRepository;

    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createAdmin(User user) {
        user.setRole("ADMIN");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
