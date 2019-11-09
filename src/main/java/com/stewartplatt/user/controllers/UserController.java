package com.stewartplatt.user.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stewartplatt.user.models.User;
import com.stewartplatt.user.repositories.UserRepository;
import reactor.core.publisher.Flux;

@RestController
public class UserController {
    UserRepository repository;

    public UserController(UserRepository userRepository) {
        repository = userRepository;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Flux<User> users() {
        return repository.findAll();
    }
}
