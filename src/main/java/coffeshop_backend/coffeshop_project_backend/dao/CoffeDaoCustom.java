package coffeshop_backend.coffeshop_project_backend.dao;

import coffeshop_backend.coffeshop_project_backend.model.Coffe;

public interface CoffeDaoCustom {

	Coffe getByCoffeName(String name);
}
