package com.cnm.poreair.depinjection;

import com.cnm.poreair.depinjection.controllers.MyController;
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
	}

}
