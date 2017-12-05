package com.example.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Path(value = "ping")
    @GET
    public String ping() {
        return "pong";
    }
}
