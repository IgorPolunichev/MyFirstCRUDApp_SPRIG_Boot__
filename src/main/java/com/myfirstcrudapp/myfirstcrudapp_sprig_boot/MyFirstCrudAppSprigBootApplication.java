package com.myfirstcrudapp.myfirstcrudapp_sprig_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstCrudAppSprigBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstCrudAppSprigBootApplication.class, args);
    }
}
