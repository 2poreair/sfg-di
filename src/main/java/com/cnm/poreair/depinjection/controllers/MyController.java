package com.cnm.poreair.depinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by 2poreair 01/15/2022
 */

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!!!");
        return "Hi Folks";
    }
}
