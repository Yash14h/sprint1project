package com.capgemini.sweetcherry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import com.capgemini.sweetcherry.model.Order;
import com.capgemini.sweetcherry.model.Response;

import com.capgemini.sweetcherry.service.OrderService;
@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService orderService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Order>addOrders(@RequestBody Order order){
		return orderService.addOrder(order);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Order> updateOrder(@RequestBody Order order){
		return orderService.updateOrder(order);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Order>> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping(value="/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Order> getOrder(@PathVariable("orderId") Integer orderId){
		return orderService.getOrder(orderId);
	}
	
	@GetMapping(value="/order/{orderName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Order>> getOrderByTotalPrice(@PathVariable("totalPrice")  Double totalPrice){
		return orderService.getOrderByPrice(totalPrice);
	}
	
	@DeleteMapping(value="/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Boolean> deleteOrder(@PathVariable("orderId") Integer orderId){
		return  orderService.deleteOrder(orderId);
	}
	
	@DeleteMapping(value="/{orderAddress}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Boolean> deleteOrderAddress(@PathVariable("orderAddress")Integer orderAddress){
		return orderService.deleteOrder(orderAddress);
	}

}
