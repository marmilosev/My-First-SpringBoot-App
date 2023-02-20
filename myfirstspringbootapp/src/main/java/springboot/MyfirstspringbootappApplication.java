package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //annotation that this is starting point of Application
public class MyfirstspringbootappApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.print(Controller.showMessage());
	}

}
