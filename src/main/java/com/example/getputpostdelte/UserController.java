package com.example.getputpostdelte;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "HTTP GET request was sent";
    }
    @PutMapping
    public String putUsers() {
        return "HTTP PUT request was sent";
    }
    @PostMapping
    public String postUsers() {
        return "HTTP POST request was sent";
    }
    @DeleteMapping
    public String deleteUsers() {
        return "HTTP DELETE request was sent";
    }
}
