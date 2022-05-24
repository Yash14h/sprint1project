package com.capgemini.sweetcherry.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString
public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="customerId")
	private int custId;
	@Column(name="customer Name")
	private String custName;
	@Column(name="customer password")
	private String custPassword;
	@Column(name="customer mobile number")
	private long custMbNo;
	@Column(name="customer mail")
	private String custmail;
	@Column(name="customer Address")
	private String custAddress;
	
}
