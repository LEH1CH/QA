package com.example.demo;

import model.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/root")
	public String ok(@RequestBody String body) {
		JSON parser = new JSON();
		People people = parser.parser(body);
		people.SetAge(500);
		return people.toString();
	}
}