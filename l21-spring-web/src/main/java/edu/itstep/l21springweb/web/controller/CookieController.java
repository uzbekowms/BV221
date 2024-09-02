package edu.itstep.l21springweb.web.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/cookie")
@RestController
public class CookieController {


    @GetMapping
    public String handle(@CookieValue("JSESSIONID") String cookie, HttpServletResponse response) {
        System.out.println(cookie);
        response.addCookie(new Cookie("USER_ID", UUID.randomUUID().toString()));
        return cookie;
    }
}
