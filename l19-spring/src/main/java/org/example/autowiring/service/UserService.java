package org.example.autowiring.service;

import lombok.RequiredArgsConstructor;
import org.example.autowiring.model.User;
import org.example.autowiring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {


    private final UserRepository repository;

    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.repository = userRepository;
    }


    public void save(User user) {
        System.out.println("User service saving user");
        repository.save(user);
    }
}
// Bean A -> Bean B -> Bean A