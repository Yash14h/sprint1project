package com.capgemini.sweetcherry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.sweetcherry.Entity.CupCake;
import com.capgemini.sweetcherry.service.AdminService;




@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;

	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody CupCake cake) {
		try {
			service.add(cake);
			return new ResponseEntity<String>(" added succesfully in shop", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong", HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("/find")
	public CupCake find(@RequestParam String cupcake) {
		return service.find(cupcake);
	}

	@GetMapping("/findall")
	public List<CupCake> viewAll() {
		return service.findall();

	}



	@PutMapping("/modifyName")
	public ResponseEntity<String> modifyName(@RequestBody CupCake cupCakeName) {
		try {
			service.modifyName(cupCakeName);
			return new ResponseEntity<String>(" name updated succesfully in shop", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<String>("something went wrong", HttpStatus.BAD_GATEWAY);
		}
	}

	@DeleteMapping("/deleteData")
	public ResponseEntity<String> delete(@RequestParam String cupcake) {
		try {
			service.delete(cupcake);
			return new ResponseEntity<String>("cupcake deleted succesfully in shop", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("something went wrong", HttpStatus.BAD_GATEWAY);
		}
	}

}