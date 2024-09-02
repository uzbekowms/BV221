package edu.itstep.l22springdata.web.controller;

import edu.itstep.l22springdata.domain.model.User;
import edu.itstep.l22springdata.domain.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public Page<User> getAllUsers(
            @PageableDefault Pageable pageable
    ) {
        return userRepository.findAll(pageable);
    }

    @GetMapping("/{id:\\d+}")
    public User getUserById(@PathVariable int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
    }

    @GetMapping("/{email:\\D+}")
    public User getUserById(@PathVariable String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("User with email " + email + " not found"));
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id:\\d+}")
    public User updateUser(
            @PathVariable int id,
            @RequestBody User user
    ) {
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}
