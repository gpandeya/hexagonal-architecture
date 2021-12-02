package gp.learn.awardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableSwagger2
public class AwardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwardServiceApplication.class, args);
	}
	@PostConstruct
	public void initializeDefaultProperties(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
	}

}
