package cn.utry.utmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class UtmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtmpApplication.class, args);
	}

}
