package com.gsbe.gsbackend_project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")

public class UserController{
    @GetMapping("/getUser")
    public String getUser(){
        return "all users";
    }
}