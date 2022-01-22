package com.cnm.poreair.depinjection;

import com.cnm.poreair.depinjection.controllers.ConstructorInjectedController;
import com.cnm.poreair.depinjection.controllers.MyController;
import com.cnm.poreair.depinjection.controllers.PropertyInjectedController;
import com.cnm.poreair.depinjection.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepInjectionApplication{

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DepInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();

		System.out.println(greeting);

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
