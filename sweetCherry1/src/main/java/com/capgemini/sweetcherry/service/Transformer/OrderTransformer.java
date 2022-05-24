package com.capgemini.sweetcherry.service.Transformer;

import com.capgemini.sweetcherry.Entity.OrderEntity;
import com.capgemini.sweetcherry.model.Order;


public class OrderTransformer {
		public static OrderEntity transformOrder(Order order) {
			if(order != null) {
				OrderEntity entity = new OrderEntity();
				entity.setUserId(order.getUserId());
				entity.setOrderDate(order.getOrderDate());
				entity.setTotalPrice(order.getTotalPrice());
				entity.setOrderAddress(order.getOrderAddress());
				entity.setPaymentType(order.getPaymentType());
				return entity;
			}
			return null;
		}
		
		
		public static Order transformOrderEntity(OrderEntity entity) {
			if(entity != null) {
			Order order = new Order();
			order.setUserId(entity.getUserId());
			order.setOrderDate(entity.getOrderDate());
			order.setTotalPrice(entity.getTotalPrice());
			order.setOrderAddress(entity.getOrderAddress());
			order.setPaymentType(entity.getPaymentType());
				
				return order;
		}
			return null;
		}
	}
