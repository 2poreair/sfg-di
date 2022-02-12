package com.cnm.poreair.depinjection.services;

import com.cnm.poreair.depinjection.services.GreetingService;
import org.springframework.stereotype.Service;

public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
    
}
