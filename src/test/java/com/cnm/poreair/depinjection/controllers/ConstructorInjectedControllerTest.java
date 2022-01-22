package com.cnm.poreair.depinjection.controllers;

import com.cnm.poreair.depinjection.services.GreetingServiceImp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting() );
    }
}
