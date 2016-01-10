package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String hello(@RequestParam(value="name", defaultValue="world") String name) {
		return "Hello " + name + "!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
