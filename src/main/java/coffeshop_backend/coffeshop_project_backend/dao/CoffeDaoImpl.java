package coffeshop_backend.coffeshop_project_backend.dao;

import org.springframework.stereotype.Repository;

import coffeshop_backend.coffeshop_project_backend.model.Coffe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CoffeDaoImpl implements CoffeDaoCustom  {
	
	private final EntityManager entityManager;

	@Override
	public Coffe getByCoffeName(String name) {
		try {
			return entityManager
					.createQuery("SELECT c FROM Coffe c WHERE c.name = :name", Coffe.class)
					.setParameter("name", name)
				.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
