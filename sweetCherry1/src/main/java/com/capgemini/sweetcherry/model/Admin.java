package com.capgemini.sweetcherry.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Admin {
	private String mailId;
	private String passWord;
}
