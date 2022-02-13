package com.cnm.poreair.depinjection;

import com.cnm.poreair.depinjection.controllers.ConstructorInjectedController;
import com.cnm.poreair.depinjection.controllers.I18nController;
import com.cnm.poreair.depinjection.controllers.MyController;
import com.cnm.poreair.depinjection.controllers.PropertyInjectedController;
import com.cnm.poreair.depinjection.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//overriding spring boots component scan so it sees all packages in the main java folder.
//@ComponentScan(basePackages = {"com.cnm.poreair.depinjection","air.twopore.pets"})
/*
* Removing component scan as we now no longer have annotations that need to be scanned outside of the
* config/GreetingServiceConfig file.
* */
@SpringBootApplication
public class DepInjectionApplication{

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DepInjectionApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
