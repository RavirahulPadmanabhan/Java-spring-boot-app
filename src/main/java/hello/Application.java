package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/v4")
	public String home() {
		return "{\"id\":\"2034\",\"projectName\":\"DEVOPS Accelerator\",\"companyName\":\"Sopra Steria\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
