package com.example.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user-service-feign")
public interface RestClient {

    @RequestMapping("/user/{userId}")
    Object getUser(@PathVariable("userId") Long userId);
}
