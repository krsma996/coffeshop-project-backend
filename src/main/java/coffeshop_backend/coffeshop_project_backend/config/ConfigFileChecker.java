package coffeshop_backend.coffeshop_project_backend.config;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.annotation.Configuration;

import coffeshop_backend.coffeshop_project_backend.utils.CarMessageSourceAccessor;
import coffeshop_backend.coffeshop_project_backend.utils.configstartup.ApplicationConstantStartUp;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ConfigFileChecker {

	private CarMessageSourceAccessor carMessageSourceAccessor;

	@PostConstruct
	void checkIfConfigurationFileExists() {
		Path filePath = Paths.get(System.getProperty("user.home"), ApplicationConstantStartUp.CAR_HOME_DIR_NAME,
				ApplicationConstantStartUp.EXTERNAL_CONFIG_FILE_NAME);

		if (Files.notExists(filePath)) {
			try {
				Path parentDir = filePath.getParent();
				if (Files.notExists(parentDir)) {
					Files.createDirectories(parentDir);
				}
				Path configFile = Paths.get(
						ClassLoader.getSystemResource(ApplicationConstantStartUp.EXTERNAL_CONFIG_FILE_NAME).toURI());
				Files.copy(configFile, filePath);

			} catch (IOException | URISyntaxException e) {
				throw new RuntimeException(
						this.carMessageSourceAccessor.getMessage("com.carshopnikola.setup.configuration.file")
								+ e.getMessage(),
						e);
			}

		}
	}
}
