package edu.itstep.l22spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RequestMapping("/test-exception")
@RestController
@RequiredArgsConstructor
public class TestController {

    private final DataSource dataSource;

    @GetMapping
    public String test() {
//        doException();
        return "Hello";
    }

    public void doException() {
        throw new NullPointerException("test");
    }
}
