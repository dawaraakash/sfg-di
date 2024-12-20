package guru.springframework.sfg_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfg_di.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SfgDiApplication.class, args);
		
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
		
	}

}
