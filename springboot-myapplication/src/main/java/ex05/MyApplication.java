package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ex05.component.MyComponent;

@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args);
//		MyComponent myComponent = ac.getBean(MyComponent.class);
//		myComponent.printHello();
	}
}
