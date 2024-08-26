package org.example.project.service.impl;

import org.example.autowiring.model.User;
import org.example.project.repositories.UserRepository;
import org.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(@Qualifier("inMemoryUserRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(int id) {
        System.out.println("Service getById");
        userRepository.getById(id);
        return null;
    }
}
