package com.example.userservicefeign.service;

import com.example.userservicefeign.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> list= List.of(
            new User(123L,"Nitin","7859906165"),
            new User(124L,"Abc","1234567890"),
            new User(125L,"Xyz","9876543210")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
