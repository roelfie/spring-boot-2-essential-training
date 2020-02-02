package top.kerstholt.springboot2.roomwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBoot2WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2WebApplication.class, args);
	}

	@RestController
	@RequestMapping("/api")
	public class ApiController{
		@GetMapping("/greeting")
		public String getGreeting(){
			return "Hello World from the API";
		}
	}

}
