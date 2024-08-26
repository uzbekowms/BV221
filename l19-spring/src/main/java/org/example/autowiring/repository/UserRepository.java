package org.example.autowiring.repository;

import lombok.RequiredArgsConstructor;
import org.example.autowiring.model.User;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class UserRepository {

    public void save(User user) {
        System.out.println(user);
        System.out.println("User saved");
    }
}
