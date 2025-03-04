package com.gsbe.gsbackend_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsbe.gsbackend_project.dto.UserDTO;
import com.gsbe.gsbackend_project.service.UserService;


@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")

public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }
}