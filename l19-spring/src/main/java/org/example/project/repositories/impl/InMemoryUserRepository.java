package org.example.project.repositories.impl;

import org.example.autowiring.model.User;
import org.example.project.repositories.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class InMemoryUserRepository implements UserRepository {
    @Override
    public User getById(int id) {
        System.out.println("Repository getByIdk");
        return null;
    }
}

