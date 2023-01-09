package fr.eni.autostock.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Merci d'indiquer la marque")
	@NotNull
	private String brand;
	
	@NotBlank(message = "Merci d'indiquer le modèle")
	@NotNull
	private String modele;
	
	@NotBlank(message = "Merci de sélectionner le type de motorisation")
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "voiture_id", referencedColumnName = "id")
	private Energie energie;
	
	//@OneToMany(mappedBy = "options")
	private List<Option> options;
	
	@NotBlank
	@NotNull
	private double price;
	
	
	public Car() {
		super();
	}
	
	
	public Car(String brand, String modele, Energie energie, List<Option> options, double price) {
		super();
		this.brand = brand;
		this.modele = modele;
		this.energie = energie;
		this.options = options;
		this.price = price;
	}
	

	public Car(long id, String brand, String modele, Energie energie, List<Option> options, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.modele = modele;
		this.energie = energie;
		this.options = options;
		this.price = price;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public Energie getEnergie() {
		return energie;
	}


	public void setEnergie(Energie energie) {
		this.energie = energie;
	}

	public List<Option> getOptions() {
		return options;
	}


	public void setOptions(List<Option> options) {
		this.options = options;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	
}
