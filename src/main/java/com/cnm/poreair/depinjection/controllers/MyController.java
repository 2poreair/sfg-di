package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingService;

import org.springframework.stereotype.Controller;

/**
 * Created by 2poreair 01/15/2022
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    /**
     * Provided another  instance of Greeting Service setting it as @Primary
     * No need to use @AutoWire here
     * nor @Qualifier because we are using @Primary in PrimaryGreetingService.java
     * and it becomes the default GreetingService
     */
}
