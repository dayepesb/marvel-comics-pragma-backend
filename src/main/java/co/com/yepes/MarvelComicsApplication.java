package co.com.yepes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MarvelComicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelComicsApplication.class, args);
	}

	@GetMapping("/test")
	public static String get(){
		return "yES";
	}
}
