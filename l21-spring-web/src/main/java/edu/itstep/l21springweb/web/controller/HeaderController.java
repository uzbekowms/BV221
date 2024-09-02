package edu.itstep.l21springweb.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/headers")
@RestController
public class HeaderController {

    @GetMapping("/header1")
    public String singleHeader(@RequestHeader("x-user-id") String id) {
        return id;
    }

    @GetMapping("/header2")
    public Map<String, String> multipleHeaders(@RequestHeader Map<String, String> headers) {
        for (Map.Entry<String, String> header : headers.entrySet()) {
            System.out.println(header.getKey() + ": " + header.getValue());
        }
        return headers;
    }

    @GetMapping("/header3")
    public ResponseEntity<Void> multipleHeadersInObj(HttpHeaders headers) {
        return ResponseEntity.ok().build();
    }
}
