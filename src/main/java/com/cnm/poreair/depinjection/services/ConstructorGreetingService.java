package com.cnm.poreair.depinjection.services;

public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World";
    }
}
