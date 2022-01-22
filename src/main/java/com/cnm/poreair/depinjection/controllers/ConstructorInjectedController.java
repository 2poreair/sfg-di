package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingService;

/**
 * Created by 2poreair 01/21/2022
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
