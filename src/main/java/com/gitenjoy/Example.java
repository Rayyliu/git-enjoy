package com.gitenjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping
    String home(){

        return "hello Git V0.8 --master update ---merge合并分支";

    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }
}
