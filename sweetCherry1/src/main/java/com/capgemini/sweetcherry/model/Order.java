package com.capgemini.sweetcherry.model;

import lombok.Data;

@Data
public class Order {
	private int userId;
	private String orderDate;
	private double totalPrice;
	private String orderAddress;
	private String paymentType;
}
