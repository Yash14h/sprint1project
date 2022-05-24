package com.capgemini.sweetcherry.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Customer {
	
	private int custId;
	private String custName;
	private String custPassword;
	private long custMbNo;
	private String custmail;
	private String custAddress;
	
}
