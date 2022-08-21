package com.example.userservicefeign.controller;

import com.example.userservicefeign.entity.User;
import com.example.userservicefeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

//import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("/user/{userId}")
    public Object getUser(@PathVariable("userId") Long userId){

        User user= userService.getUser(userId);
        //http://localhost:9002/contact/user/{userId}

//        List contacts=this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);
//
//        user.setContacts(contacts);

        return  user;
    }

}
