package com.launchpad.anshul.psych;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PsychApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsychApplication.class, args);
	}

}
