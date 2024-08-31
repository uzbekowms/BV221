package edu.itstep.l21springweb.web.controller;

import edu.itstep.l21springweb.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users-2")
public class MultipleObjectsController {

    @PostMapping
    public void multipleObjects(@RequestParam("from") User fromUser, @RequestParam("to") User toUser) {
        System.out.println("From");
        System.out.println(fromUser);
        System.out.println("To");
        System.out.println(toUser);
    }
}
