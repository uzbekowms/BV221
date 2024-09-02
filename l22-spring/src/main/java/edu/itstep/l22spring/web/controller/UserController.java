package edu.itstep.l22spring.web.controller;

import edu.itstep.l22spring.domain.model.User;
import edu.itstep.l22spring.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;


    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
