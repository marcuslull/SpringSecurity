package com.marcuslull.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2")
public class ApiController {

    @GetMapping("/test")
    public ResponseEntity<String> getTest() {
        String path = "api/v2/test";
        return new ResponseEntity<>(path, HttpStatus.OK);
    }
}
