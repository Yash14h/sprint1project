package com.capgemini.sweetcherry.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="Admin")
public class AdminModel {
	private String mailId;
	private String passWord;
}
