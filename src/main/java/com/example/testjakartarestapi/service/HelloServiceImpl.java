package com.example.testjakartarestapi.service;

import com.example.testjakartarestapi.repository.UsernameRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class HelloServiceImpl implements HelloService {

    @Inject
    private UsernameRepository repository;

    @Override
    public List getHello() {
        return repository.findUsernames();
    }
}
