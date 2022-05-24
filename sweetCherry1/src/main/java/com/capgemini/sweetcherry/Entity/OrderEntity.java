package com.capgemini.sweetcherry.Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.capgemini.sweetcherry.Entity.OrderEntity;

import lombok.Data;



@Data
@EntityScan
@Table(name="Order_Details")

public class OrderEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userId;
	@Temporal(TemporalType.DATE)
	private String orderDate;
	private double totalPrice;
	private String orderAddress;
	private String paymentType;
	@OneToMany(mappedBy = "order")
	private List<OrderEntity> order;
		
	}