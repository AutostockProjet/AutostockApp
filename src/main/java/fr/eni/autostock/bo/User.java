package fr.eni.autostock.bo;

<<<<<<< HEAD
public class User {

=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String lastName;
	private String firstName;
	
	private String email;
	private int phone;
	@Column(nullable = false, unique = true)
	private String login;
	private String password;
	
>>>>>>> branch 'master' of https://github.com/AutostockProjet/AutostockApp.git
}
