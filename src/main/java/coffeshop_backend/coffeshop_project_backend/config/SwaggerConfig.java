package coffeshop_backend.coffeshop_project_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	
	@Bean
	OpenAPI openApiDoc() {
		
		OpenAPI apiDoc = new OpenAPI();
		apiDoc.info(new Info()
				.title("Coffe Managment Api")
				.description("Documentation of all apis in Coffe App")
				.version("1.0.0")
				.license(new License()
						.name("CopyRight by Nikola Krsmanovic").url("www.someExample.com")));
		
		
		return apiDoc;
	}

}
