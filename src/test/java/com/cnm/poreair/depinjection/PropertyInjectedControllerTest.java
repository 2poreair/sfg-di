package com.cnm.poreair.depinjection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.cnm.poreair.depinjection.controllers.PropertyInjectedController;
import com.cnm.poreair.depinjection.services.GreetingServiceImp;

class PropertyInjectedControllerTest {
    
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImp();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
