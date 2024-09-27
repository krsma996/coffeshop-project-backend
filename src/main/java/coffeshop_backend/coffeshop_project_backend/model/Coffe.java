package coffeshop_backend.coffeshop_project_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COFFE")
@Getter
@Setter
public class Coffe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "COFFE_NAME")
	private String name;
	@Column(name = "COFFE_PRICE")
	private double price;
	@Column(name = "COFFE_BRAND")
	private String brand;
	@Column(name = "COFFE_DESCRIPTION")
	private String description;

}
