package edu.itstep.l21springweb.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/requests")
public class RequestController {

    @GetMapping
    public String getRequest(HttpServletRequest request) {
        System.out.println(request);
        return request.getRequestId();
    }
}
