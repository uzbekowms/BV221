package edu.itstep.services;

import edu.itstep.repositories.UserRepository;
import lombok.Getter;

import java.util.UUID;

@Getter
public class CommentService {
    private final String id;

    private final UserRepository userRepository;

    public CommentService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.id = UUID.randomUUID().toString();
        System.out.println("Comment Service initialized " + id);
    }

}
