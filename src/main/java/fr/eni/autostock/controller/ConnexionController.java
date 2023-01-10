package fr.eni.autostock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import fr.eni.autostock.bo.User;

import fr.eni.autostock.service.UserService;


@Controller
@SessionAttributes({ "userSession" })
@RequestMapping("/")
public class ConnexionController {
	// Injection du service
	private UserService userService;

	
	@Autowired
	public ConnexionController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/login")
	public String login() {
		return "view-login-form";
	}

	@PostMapping("/login")
	public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password,
			Model model) {
		String retour = "view-login-form";
		User user = userService.login(email, password);
		if (user != null) {
			model.addAttribute("userSession", user);
			System.out.println(user);
			return "index";
		} 
		
		return retour;
	}
 

}