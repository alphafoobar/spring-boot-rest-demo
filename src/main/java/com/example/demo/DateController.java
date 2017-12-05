package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/date")
public class DateController {

    @RequestMapping(method = RequestMethod.GET)
    public String readDate() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("/var/container-vol/date"))) {
            return reader.readLine();
        }
    }
}
