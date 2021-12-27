package esk.annotations.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "esk.temporary", "esk.annotations.demo" })
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Context loaded on : " + new Date(context.getStartupDate()));
		System.out.println("My app is named : " + context.getId());
	}

}
