package dev.paie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties") // le fichier est ignoré sur ce projet, ask Rossi why
@SpringBootApplication
public class PaieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaieAppApplication.class, args);

	}

}
