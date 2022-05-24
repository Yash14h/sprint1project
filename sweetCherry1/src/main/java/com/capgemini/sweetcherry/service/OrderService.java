package com.capgemini.sweetcherry.service;

import java.util.List;

import com.capgemini.sweetcherry.model.Order;
import com.capgemini.sweetcherry.model.Response;

public interface OrderService {
	public Response<Order>addOrder(Order  order);
	public Response<Order>updateOrder(Order order);
	public Response<List<Order>>getAllOrders();
	public Response<Order>getOrder(Integer userId);
	public Response<List<Order>>getOrderByPrice(Double totalPrice);
	public Response<Boolean>deleteOrder(Integer userId);
	public Response<Boolean>deleteOrderAddress(Integer orderAddress);
	
}