package com.hemza.rental_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemza.rental_backend.dto.UserDTO;
import com.hemza.rental_backend.model.User;
import com.hemza.rental_backend.repository.UserRepository;

@Service
public class UserService {
@Autowired
    private UserRepository userRepository;

    public User save(UserDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword()); // à hasher plus tard
        return userRepository.save(user);
    }
}
