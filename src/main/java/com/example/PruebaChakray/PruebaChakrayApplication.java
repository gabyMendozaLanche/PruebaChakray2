package com.example.PruebaChakray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PruebaChakrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaChakrayApplication.class, args);
	}

    @GetMapping("/hello")
    public String hello()  {
      return "Hola Mundo";
    }
}
