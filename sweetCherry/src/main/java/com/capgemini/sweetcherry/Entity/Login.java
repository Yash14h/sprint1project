package com.capgemini.sweetcherry.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="Login")
public class Login {
		@Id
		@Column(name="email")	
	public String  email;
		@Column(name="password")
	public String password;

}
