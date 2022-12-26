package com.grocery.controller;

 


import javax.validation.Valid;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.grocery.dto.UserDTO;
import com.grocery.entity.User;
import com.grocery.exception.InvalidCredentialsException;
import com.grocery.exception.UserExistsException;
import com.grocery.service.UserService;

 

@CrossOrigin(origins="http://localhost:4200")
@RestController
@Validated
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody @Valid UserDTO userdto) throws UserExistsException {
        return userService.registerUser(userdto);

    }

    @PostMapping("/login")
    public User loginUser(@RequestBody UserDTO userdto) throws InvalidCredentialsException {
        return     userService.loginUser(userdto);


    }

 

}