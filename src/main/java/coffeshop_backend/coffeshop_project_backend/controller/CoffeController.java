package coffeshop_backend.coffeshop_project_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coffeshop_backend.coffeshop_project_backend.dto.TestiranjePozivaKlasa;

@RestController
public class CoffeController {
		
		
		
		
		@GetMapping("/hello")
		public ResponseEntity<TestiranjePozivaKlasa> helloNikola() {
			TestiranjePozivaKlasa test = new TestiranjePozivaKlasa("NikolaCAjic");
			return ResponseEntity.ok(test);
		}
		
		
		@GetMapping("/test")
		public String cao() {
			return "Cao";
		}
	
	}
