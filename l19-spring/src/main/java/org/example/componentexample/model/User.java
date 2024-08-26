package org.example.componentexample.model;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
//@Component
public class User {
    private String name;
    private String role;

    public User() {
        System.out.println("User created");
    }

    @PostConstruct
    public void init() {
        this.name = "Oleg";
    }
}
