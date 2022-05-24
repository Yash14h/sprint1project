package com.capgemini.sweetcherry.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.sweetcherry.Entity.OrderEntity;
@Repository
public interface OrderDao  extends JpaRepository<OrderEntity, Integer>  {
	List<OrderEntity> findAllByTotalPrice(Double totalPrice);

}
