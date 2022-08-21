package com.example.feign.controllers;


import com.example.feign.clients.RestClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {



    final RestClient restClient;

    @Autowired
    public HomeController(RestClient restClient){
        this.restClient=restClient;
    }

    @GetMapping("/get-user/{userId}")
    public Object getUser(@PathVariable("userId") Long userId){
        return restClient.getUser(userId);
    }
}
