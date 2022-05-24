package com.capgemini.sweetcherry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private loginrepository loginRepository;
	
	@GetMapping("/login")
	public List<Login> getAllLogins(){
		return LoginRepository.findAll();
	}
	@PostMapping("/Login")
	public loginmodel createLogin(@RequestBody Login login){
		return loginRepository.save(login);
	}

}
