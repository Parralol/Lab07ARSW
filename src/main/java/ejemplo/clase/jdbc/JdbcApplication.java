package ejemplo.clase.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ejemplo.clase.jdbc.db", "ejemplo.clase.jdbc.entity", "ejemplo.clase.jdbc.service", "ejemplo.clase.jdbc.controller"})
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

}
