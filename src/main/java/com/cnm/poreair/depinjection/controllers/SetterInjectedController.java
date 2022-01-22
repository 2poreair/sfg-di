package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingService;

/**
 * Created by 2poreair 01/21/2022
 */
public class SetterInjectedController {
    
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    } 

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
