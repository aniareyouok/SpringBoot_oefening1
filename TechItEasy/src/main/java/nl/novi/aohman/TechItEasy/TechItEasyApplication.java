package nl.novi.aohman.TechItEasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TechItEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechItEasyApplication.class, args);
	}

}
