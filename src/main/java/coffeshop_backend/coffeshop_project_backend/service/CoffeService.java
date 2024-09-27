package coffeshop_backend.coffeshop_project_backend.service;

import coffeshop_backend.coffeshop_project_backend.dto.CoffeDto;
import jakarta.validation.constraints.NotNull;

public interface CoffeService {
	
	
	CoffeDto getByCoffeName(String name);
	
	CoffeDto save(@NotNull CoffeDto coffeDto);

}
