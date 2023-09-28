package test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
	@GetMapping
	public String welcome(){
		return "Welcome to my coding changed !!";

	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
