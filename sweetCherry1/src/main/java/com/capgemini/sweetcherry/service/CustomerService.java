package com.capgemini.sweetcherry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sweetcherry.Dao.CupcakeDao;
import com.capgemini.sweetcherry.Entity.CupCake;



@Service
public class CustomerService {
	@Autowired
	CupcakeDao cupcakeDao;
	public CupCake add(CupCake cake) {
		return cupcakeDao.save(cake);
	}

	public CupCake find(String cupcake) {
		CupCake cake = cupcakeDao.findByCupcake(cupcake);
		return cake;
	}

	public List<CupCake> findall() {
		List<CupCake> findAll = cupcakeDao.findAll();
		return findAll;
	}



}
