package fr.eni.autostock.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.autostock.bo.Option;
import fr.eni.autostock.service.CarService;

@Controller
@RequestMapping("/vehicules")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping
	public String listeVehiculesRoute(Model model) {
		
		model.addAttribute("listeVehicules", carService.ListCars());
		return "liste_vehicules";
	}
	
	@GetMapping("/add")
	public String addVehiculeRoute(Model model) {
		
		
		model.addAttribute("listeMarques", carService.listBrands());
		model.addAttribute("listeOptions", carService.listOptions());
		
		
		return "ajouter_vehicule";
	}

}
