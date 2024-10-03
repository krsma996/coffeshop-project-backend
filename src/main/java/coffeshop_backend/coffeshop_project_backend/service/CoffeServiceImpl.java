package coffeshop_backend.coffeshop_project_backend.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import coffeshop_backend.coffeshop_project_backend.dao.CoffeDao;
import coffeshop_backend.coffeshop_project_backend.dto.CoffeDto;
import coffeshop_backend.coffeshop_project_backend.model.Coffe;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class CoffeServiceImpl implements CoffeService {
	
	private final CoffeDao coffeDao;

	@Override
	public CoffeDto getByCoffeName(String name) {
		Coffe coffe = this.coffeDao.getByCoffeName(name);
		if(coffe != null) {
			CoffeDto coffeDto = new CoffeDto();
			coffeDto.setId(coffe.getId());
			coffeDto.setName(coffe.getName());
			coffeDto.setPrice(coffe.getPrice());
			coffeDto.setBrand(coffe.getBrand());
			coffeDto.setDescription(coffe.getDescription());
			log.info("Successfuly returned By Name");
			return coffeDto;
		}else {
			log.error("Something went wrong with returning by name");
			throw new NullPointerException("ITS NULL!");
		}
	}

	@Transactional
	@Override
	public CoffeDto save(@NotNull CoffeDto coffeDto) {
		if(coffeDto !=null) {
			Coffe newCoffe = new Coffe();
			BeanUtils.copyProperties(coffeDto, newCoffe);
			this.coffeDao.save(newCoffe);
			log.info("Successfuly saved object to database " +coffeDto);
			return coffeDto;
		}else {
			log.error("Something went wrong when you try to persist objct Coffe to database");
			return null; 
		}
		
	}

	@Override
	public CoffeDto deleteCoffeByName(String coffeName) {
		Coffe foundedCoffe = this.coffeDao.getByCoffeName(coffeName);
		if(foundedCoffe !=null) {
			log.info("Coffe founded it is going to be deleted from db");
			this.coffeDao.delete(foundedCoffe);
			log.info("Successfully deleted coffe from db");
			
		}else {
			throw new NullPointerException("coffe dosent exist");
		}
		return null;
	}

	

	

}
