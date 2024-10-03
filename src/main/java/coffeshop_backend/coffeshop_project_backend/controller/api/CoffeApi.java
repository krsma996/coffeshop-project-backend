package coffeshop_backend.coffeshop_project_backend.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import coffeshop_backend.coffeshop_project_backend.dto.CoffeDto;
import coffeshop_backend.coffeshop_project_backend.utils.ApplicationConstants;
import coffeshop_backend.coffeshop_project_backend.utils.ApplicationStatusCode;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = ApplicationConstants.COFFE_API,
	 description = "The api for dealing with all about Coffe information")
public interface CoffeApi {
	

	@Operation(summary = "Test getting by coffe name ",description = "Test return a value from a db by name")
	@ApiResponses(value = {
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_200,description = "Ok"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_400,description = "Bad Request,invalid input parameters"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_403,description = "Forbidden"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_404,description = "Resource not found"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_500,description = "Internal server error,something went wrong")	
	})
	@GetMapping("/coffeName")
	public ResponseEntity<String> getByCoffeName(@RequestParam String name);
	
	
	
	@Operation(summary = "Persist coffe to db",description = "Test persist to db object")
	@ApiResponses(value = {
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_200,description = "Ok"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_400,description = "Bad Request,invalid input parameters"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_403,description = "Forbidden"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_404,description = "Resource not found"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_500,description = "Internal server error,something went wrong")	
	})
	@PostMapping("/saveCoffe")
	public ResponseEntity<CoffeDto> saveCoffeToDatabase(@RequestBody CoffeDto coffeDto);
	
	
	@Operation(summary = "Delete Coffe From Db",description = "Delete Coffe By name")
	@ApiResponses(value = {
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_200,description = "Ok"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_400,description = "Bad Request,invalid input parameters"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_403,description = "Forbidden"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_404,description = "Resource not found"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_500,description = "Internal server error,something went wrong")	
	})
	@DeleteMapping("/deleteCoffe")
	public ResponseEntity<CoffeDto> deleteCoffeFromDb(@RequestParam String coffeName);
}
