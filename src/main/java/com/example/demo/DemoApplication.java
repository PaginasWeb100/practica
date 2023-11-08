package com.practica.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class practica {

	public static void main(String[] args) {
		SpringApplication.run(practica.class, args);
	}

}

@GetMapping("/")
public String init() {

Como desplegar una aplicación de java en Azure 8

return String.format("Welcome to Java CRUD Application!");
}

@GetMapping("/hello")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("Hello %s!", name);
}