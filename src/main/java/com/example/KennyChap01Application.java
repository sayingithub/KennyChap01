package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KennyChap01Application {

	public static void main(String[] args) {
		SpringApplication.run(KennyChap01Application.class, args);
	}	
	
	@Autowired OwnerRepository owerRespository;
	
	@PostConstruct
	public void init(){
		List<Owner> list = new ArrayList<Owner>();

		Owner owner = new Owner();
		owner.setId(0l);
		owner.setOwnerName("Mukesh Ambani");
		owner.setOwnerLocation("Mumbai");		
		list.add(owner);
		
		owner = new Owner();
		owner.setId(1l);
		owner.setOwnerName("Srinivas");
		owner.setOwnerLocation("Chennai");		
		list.add(owner);

		owner = new Owner();
		owner.setId(2l);
		owner.setOwnerName("SRK");
		owner.setOwnerLocation("Kolkata");		
		list.add(owner);
		
		owner = new Owner();
		owner.setId(3l);
		owner.setOwnerName("Preeti");
		owner.setOwnerLocation("Punjab");		
		list.add(owner);		

		owner = new Owner();
		owner.setId(4l);
		owner.setOwnerName("Maran");
		owner.setOwnerLocation("Hyderabad");		
		list.add(owner);		
		
		owerRespository.save(list);		
	}

	

}
