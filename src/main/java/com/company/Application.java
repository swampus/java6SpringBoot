package com.company;

import com.company.controller.CorvidController;
import com.company.service.CovidFormService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
        System.out.println("Hello Wourld!");
    }
}
