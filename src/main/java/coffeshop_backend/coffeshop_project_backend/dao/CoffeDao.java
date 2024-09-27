package coffeshop_backend.coffeshop_project_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import coffeshop_backend.coffeshop_project_backend.model.Coffe;

public interface CoffeDao extends JpaRepository<Coffe, Integer> ,CoffeDaoCustom {
		
	 
}
