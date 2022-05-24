package com.capgemini.sweetcherry.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.sweetcherry.Entity.Login;

public interface LoginRepository extends JpaRepository<Login,Long> {

}