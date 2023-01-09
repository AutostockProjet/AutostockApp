package fr.eni.autostock.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Option {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String option;
	
	public Option() {
	}
	
	
	public Option(long id, String option) {
		super();
		this.id = id;
		this.option = option;
	}
	
	public Option(String option) {
		super();
		this.option = option;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Option [id=");
		builder.append(id);
		builder.append(", option=");
		builder.append(option);
		builder.append("]");
		return builder.toString();
	}

}
