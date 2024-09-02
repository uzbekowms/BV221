package edu.itstep.l21springweb.web.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/sessions")
@RestController
public class SessionController {

    @GetMapping
    public String getSession(HttpSession httpSession) {
        System.out.println(httpSession.getCreationTime());
        return httpSession.getId();
    }
}
