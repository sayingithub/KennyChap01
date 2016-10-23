package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {
	
	@Autowired
	OwnerRepository ownerRepository;
	
	@RequestMapping("/owners")
	public Iterable<Owner> getOwners(){
		return ownerRepository.findAll();
	}
	
	@RequestMapping("/owners/{id}")
	public Owner getOwner(@PathVariable Long id){
		return ownerRepository.findOne(id);		
	}
}
