package com.company.controller;

import com.company.model.CorvidForm;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorvidController {

    @PostMapping("/saveCorvid")
    public String saveCorvid(CorvidForm corvidForm){
        System.out.println("Corvid: " + corvidForm);
        return "OK";
    }
}
