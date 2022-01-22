package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 2poreair 01/21/2022
 */

@Controller
public class SetterInjectedController {
    
    private GreetingService greetingService;
    
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    } 

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
