package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 2poreair 01/15/2022
 */

@Controller
public class PropertyInjectedController {
    
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
