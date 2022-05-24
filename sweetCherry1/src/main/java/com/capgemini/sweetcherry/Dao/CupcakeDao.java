package com.capgemini.sweetcherry.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.sweetcherry.Entity.CupCake;

@Repository
public interface CupcakeDao extends JpaRepository<CupCake, Integer>{

	public CupCake findByCupcake(String cupcake) ;

	public CupCake deleteByCupcake(String cupcake);
	

}
