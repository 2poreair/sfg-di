package com.cnm.poreair.depinjection.config;

import com.cnm.poreair.depinjection.services.ConstructorGreetingService;
import com.cnm.poreair.depinjection.services.PropertyInjectedGreetingService;
import com.cnm.poreair.depinjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
