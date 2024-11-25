package coffeshop_backend.coffeshop_project_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@PropertySources(
		value = { @PropertySource("file:${user.home}/.carnikola/configuration.properties")})
@EnableScheduling
@EnableAsync
public class CoffeshopProjectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeshopProjectBackendApplication.class, args);
    }

}
