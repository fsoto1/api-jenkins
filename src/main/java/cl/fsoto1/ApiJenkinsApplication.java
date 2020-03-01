package cl.fsoto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJenkinsApplication.class, args);
	}

	@GetMapping
	public String get(){
		return "Hola Mundo!";
	}
}
