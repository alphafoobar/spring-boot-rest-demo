package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @Path("date")
    @GET
    public String readDate() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("/var/container-vol/date"))) {
            return reader.readLine();
        }
    }
}
