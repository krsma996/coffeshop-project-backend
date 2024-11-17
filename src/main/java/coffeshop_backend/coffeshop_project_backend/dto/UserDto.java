package coffeshop_backend.coffeshop_project_backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = false)
@Schema(description = "User Data")
public class UserDto {

	@NotNull
	private int id;
	private String userName;
	private String email;
	private String password;
}
