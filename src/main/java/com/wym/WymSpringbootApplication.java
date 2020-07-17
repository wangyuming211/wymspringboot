package com.wym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.wym.*")
public class WymSpringbootApplication  {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(WymSpringbootApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
