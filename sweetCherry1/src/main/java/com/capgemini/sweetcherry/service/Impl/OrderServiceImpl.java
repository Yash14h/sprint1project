package com.capgemini.sweetcherry.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.capgemini.sweetcherry.Dao.OrderDao;

import com.capgemini.sweetcherry.Entity.OrderEntity;
import com.capgemini.sweetcherry.model.AppError;

import com.capgemini.sweetcherry.model.Order;
import com.capgemini.sweetcherry.model.Response;
import com.capgemini.sweetcherry.service.Transformer.OrderTransformer;

import com.capgemini.sweetcherry.service.OrderService;
@Service
public abstract class OrderServiceImpl implements OrderService  {
	@Autowired
	private OrderDao orderDao;
	@Override
	public Response<Order> addOrder(Order order) {
		Response<Order> response = new Response<>();
		try {
			order.setUserId(0);
			OrderEntity entity = OrderTransformer.transformOrder(order);
			//entity.setCategory(categoryDao.findById(mobile.getCategory().getCategoryId()).orElse(null));
			entity = orderDao.save(entity);
			response.setData(OrderTransformer. transformOrderEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADDING_ORDER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}
	@Override
	public Response<Order>updateOrder(Order order) {
		Response<Order> response = new Response<>();
		try {
			OrderEntity entity = OrderTransformer.transformOrder(order);
			//entity.setCategory(categoryDao.findById(order.getCategory().getCategoryId()).orElse(null));
			entity = orderDao.save(entity);
			response.setData(OrderTransformer. transformOrderEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_ORDER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Order>> getAllOrders() {
		Response<List<Order>> response = new Response<>();
		try {
			List<OrderEntity> entities =orderDao.findAll();
			List<Order> orders = new ArrayList<Order>();
			if (entities != null) {
				for (OrderEntity entity : entities) {
					orders.add(OrderTransformer. transformOrderEntity(entity));
				}
			}
			response.setData(orders);

		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_ORDERS");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Order> getOrder(Integer userId) {
		Response<Order> response = new Response<>();
		try {
			Optional<OrderEntity> opEntity = orderDao.findById(userId);
			if (opEntity.isPresent()) {
				response.setData(OrderTransformer. transformOrderEntity(opEntity.get()));
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_ORDERS");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Order>>getOrderByPrice(Double totalPrice) {
		Response<List<Order>> response = new Response<>();
		try {
			List<OrderEntity> entities = orderDao.findAllByTotalPrice(totalPrice);
			List<Order> orders = new ArrayList<Order>();
			if (entities != null) {
				for (OrderEntity entity : entities) {
					orders.add(OrderTransformer. transformOrderEntity(entity));
				}
			}
			response.setData(orders);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_ORDERS");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Boolean> deleteOrder(Integer userId) {
		Response<Boolean> response = new Response<>();
		try {
			orderDao.deleteByUserId(userId);
			response.setData(true);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_MOBILE");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}
}
