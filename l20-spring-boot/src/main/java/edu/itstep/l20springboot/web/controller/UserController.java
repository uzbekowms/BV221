package edu.itstep.l20springboot.web.controller;

import edu.itstep.l20springboot.domain.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final List<User> users = new ArrayList<>();

    @GetMapping("")
    public ResponseEntity<List<User>> findAll(
            @RequestParam(name = "offset", required = false, defaultValue = "0") int offset,
            @RequestParam(name = "limit", required = false, defaultValue = "100") int limit
    ) {
        System.out.println(offset);
        System.out.println(limit);
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(users);
    }


    @GetMapping("/{id:\\d+}")
    public String findById(@PathVariable int id) {
        return "NUMBER";
    }

    @GetMapping("/{slug:^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$}")
    public String findMe(@PathVariable String slug) {
        return "SLUG";
    }

    @PostMapping
    public User create(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        users.remove(id);
        return true;
    }

    @PutMapping("/{id}")
    public User update(
            @PathVariable int id,
            @RequestBody User user
    ) {
        users.set(id, user);
        return user;
    }
}
