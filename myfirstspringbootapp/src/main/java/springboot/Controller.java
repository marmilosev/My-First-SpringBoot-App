package springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // making restful web services
@RequestMapping("/test") //used to map web requests onto specific handler classes and/or handler methods
public class Controller {
	@GetMapping //handle the HTTP GET requests matched with the given URI expression
	public static String showMessage() {
		return "First Spring Boot App";
	}
	
}