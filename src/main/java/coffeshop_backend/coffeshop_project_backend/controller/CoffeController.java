package coffeshop_backend.coffeshop_project_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import coffeshop_backend.coffeshop_project_backend.controller.api.CoffeApi;
import coffeshop_backend.coffeshop_project_backend.dto.CoffeDto;
import coffeshop_backend.coffeshop_project_backend.dto.TestiranjePozivaKlasa;
import coffeshop_backend.coffeshop_project_backend.service.CoffeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CoffeController implements CoffeApi {
	
	private final CoffeService coffeService;

	@Override
	public ResponseEntity<TestiranjePozivaKlasa> helloNikola() {
		TestiranjePozivaKlasa test = new TestiranjePozivaKlasa("NikolaCAjic");
		return ResponseEntity.ok(test);
	}

	@Override
	public String cao() {
		return "Cao";
	}

	@Override
	public ResponseEntity<String> getByCoffeName(String name) {
		CoffeDto coffe = this.coffeService.getByCoffeName(name);
		String coffeName = coffe.getName();
		return ResponseEntity.ok(coffeName);
	}

	@Override
	public ResponseEntity<CoffeDto> saveCoffeToDatabase(CoffeDto coffeDto) {
		if(coffeDto == null) {
			log.error("CoffeDto is null");
		}
		CoffeDto newCoffe = this.coffeService.save(coffeDto);
		return new ResponseEntity<>(newCoffe,HttpStatus.CREATED);
	}
	



	
}
