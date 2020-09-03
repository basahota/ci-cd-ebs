package com.javatechie.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CiCdEbsApplication {

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return name + " Welcome to Java techie";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdEbsApplication.class, args);
    }

}
