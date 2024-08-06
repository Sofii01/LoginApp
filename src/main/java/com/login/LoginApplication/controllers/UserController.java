package com.login.LoginApplication.controllers;

import com.login.LoginApplication.models.User;
import com.login.LoginApplication.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/get")
    public List<User> getUsers(){
        return userService.getAllUser();
    }
}
