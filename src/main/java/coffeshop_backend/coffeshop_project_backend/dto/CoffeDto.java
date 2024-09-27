package coffeshop_backend.coffeshop_project_backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = false)
@Schema(description = "Coffe Data")
public class CoffeDto {

	@NotNull
	private int id;
	private String name;
	private double price;
	private String brand;
	private String description;	
	
	
	
}


