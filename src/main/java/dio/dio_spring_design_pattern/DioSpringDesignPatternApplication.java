package dio.dio_spring_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioSpringDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringDesignPatternApplication.class, args);
	}

}
