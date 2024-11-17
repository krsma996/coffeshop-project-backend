package coffeshop_backend.coffeshop_project_backend.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coffeshop_backend.coffeshop_project_backend.utils.ApplicationConstants;
import coffeshop_backend.coffeshop_project_backend.utils.ApplicationStatusCode;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = ApplicationConstants.USER_API,description = "The api for dealing with all about User information")
public interface UserApi {
	
	
	@Operation(summary = "Get user by userName ",description = "Return User by his name")
	@ApiResponses(value = {
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_200,description = "Ok"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_400,description = "Bad Request,invalid input parameters"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_403,description = "Forbidden"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_404,description = "Resource not found"),
		@ApiResponse(responseCode = ApplicationStatusCode.CODE_500,description = "Internal server error,something went wrong")	
	})
	@GetMapping("/username")
	public ResponseEntity<String> getByCoffeName(@RequestParam String userName);

}
