package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingServiceImp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by 2poreair 01/21/2022
 */
public class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImp());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
