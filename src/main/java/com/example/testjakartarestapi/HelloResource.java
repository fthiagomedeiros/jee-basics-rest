package com.example.testjakartarestapi;

import com.example.testjakartarestapi.service.HelloService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Path("/hello-world")
@NoArgsConstructor
@AllArgsConstructor
public class HelloResource {

    @Inject
    private HelloService service;

    @GET
    @Produces("text/plain")
    public String hello() {
        return service.getHello();
    }
}