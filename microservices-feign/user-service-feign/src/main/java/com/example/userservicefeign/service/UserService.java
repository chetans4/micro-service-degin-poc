package com.example.userservicefeign.service;

import com.example.userservicefeign.entity.User;

public interface UserService {

    public User getUser(Long id);
}
