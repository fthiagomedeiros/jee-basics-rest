package com.example.testjakartarestapi.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "Francisco Thiago";
    }
}
