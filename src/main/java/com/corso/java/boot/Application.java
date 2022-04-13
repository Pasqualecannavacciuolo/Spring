package com.corso.java.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    String home() { return "Ciao Mondo!"; }

    @RequestMapping("/all")
    List<User> test1() {
        List<User> u = new ArrayList<>();
        u.add(new User("Pasquale"));
        u.add(new User("Marco"));
        u.add(new User("Vincenzo"));
        u.add(new User("Ciro"));
        return u;
    }

    @RequestMapping("/user")
    User test() {
        User u = new User("Pasquale");
        return u;
    }
}
