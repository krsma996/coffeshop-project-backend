package coffeshop_backend.coffeshop_project_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import coffeshop_backend.coffeshop_project_backend.controller.api.UserApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UserController  implements UserApi{
	
	
	
	
	@Override
	public ResponseEntity<String> getByCoffeName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
