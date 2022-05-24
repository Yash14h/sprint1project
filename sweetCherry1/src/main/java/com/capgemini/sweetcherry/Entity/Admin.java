package com.capgemini.sweetcherry.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="Admin")
public class Admin {
	private String mailId;
	private String passWord;
}
