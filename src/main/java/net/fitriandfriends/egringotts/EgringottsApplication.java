package net.fitriandfriends.egringotts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EgringottsApplication {

	public static void main(String[] args) {

		SpringApplication.run(EgringottsApplication.class, args);

	}

	@GetMapping("/")
	public String apiRoot() {

		return "Hello, E-Gringotts!";

	}

}