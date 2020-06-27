package com.company.controller;

import com.company.model.Cat;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HellowWourldController {

    @GetMapping("/hi/{id}")
    public List<Cat> hello(@PathVariable String id,
                           @PathParam("index") String index) {
        System.out.println(id + " - " + index );

        List<Cat> catList = new ArrayList<>();

        Cat cat = new Cat();
        cat.setColor(12);
        cat.setId("1");
        cat.setName("Kitty");

        Cat cat2 = new Cat();
        cat2.setColor(1111);
        cat2.setId("2");
        cat2.setName("Betty");

        Cat cat3 = new Cat();
        cat3.setColor(4444);
        cat3.setId("3");
        cat3.setName("Jetty");

        catList.add(cat);
        catList.add(cat2);
        catList.add(cat3);

        catList = catList.stream().filter(
                t-> t.getId().equals(id)
        ).collect(Collectors.toList());


        return catList;
    }

    @GetMapping("/hi2")
    public String hello2() {
        return "Hello Wourld";
    }

    @PostMapping("/save")
    public String saveCat(@RequestBody Cat cat){
        System.out.println("OUR NEW CAT: " + cat);
        return "OK";
    }

}
