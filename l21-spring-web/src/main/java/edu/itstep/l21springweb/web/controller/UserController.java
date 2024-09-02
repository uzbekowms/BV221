package edu.itstep.l21springweb.web.controller;

import edu.itstep.l21springweb.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {


    @GetMapping("/{id}")
    public ResponseEntity<User> getMe(User user) {
        return ResponseEntity.ok(user);
    }
}
