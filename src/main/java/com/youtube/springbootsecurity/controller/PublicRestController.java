package com.youtube.springbootsecurity.controller;

import com.youtube.springbootsecurity.db.UserRepository;
import com.youtube.springbootsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public")
public class PublicRestController {
    private UserRepository userRepository;

    @Autowired
    public PublicRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("test1")
    public String test1() {return "API Test 1";}

    @GetMapping("test2")
    public String test2() {return "API Test 2";}

    @GetMapping("users")
    public List<User> users() {
        return userRepository.findAll();
    }
}
