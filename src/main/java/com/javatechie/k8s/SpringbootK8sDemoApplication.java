package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/")
	public String displayMessage1(){
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}

	@GetMapping("/message")
	public String displayMessage2(){
		return "You are under context - message";
	}

	@GetMapping("/hello")
	public String displayMessage3(){
		return "Hello There";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
