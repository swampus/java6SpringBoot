package com.company.controller;

import com.company.model.CorvidForm;
import com.company.service.CovidFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CorvidController {

    @Autowired
    public CovidFormService covidFormService;

    @PostMapping("/saveCorvid")
    public String saveCorvid(CorvidForm corvidForm){
        System.out.println("Corvid: " + corvidForm);
        covidFormService.saveCorvidForm(corvidForm);
        return "OK";
    }

    @GetMapping("/CorvidForm/{personalCode}")
    public List<CorvidForm> getCorvidFormById(@PathVariable  String personalCode){
        System.out.println("personalCode: " + personalCode);
        return covidFormService.checkCorvidFormExists(personalCode);
    }

    @GetMapping("/CorvidForm")
    public String getCorvidFormById(@RequestParam(name = "FN")
                                                String firstName,
                                    @RequestParam(name = "SN")
                                            String lastName){
        System.out.println("firstName: " + firstName + " - lastName " + lastName);
        return "TM{";
    }
}
