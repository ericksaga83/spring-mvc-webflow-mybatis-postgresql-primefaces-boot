package net.sotanobinario.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class StackWebBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackWebBootApplication.class, args);
	}

}
