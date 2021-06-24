package practice.cargarimagen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CargarImagenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CargarImagenApplication.class, args);
	}

}
