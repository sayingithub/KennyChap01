package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner {

	@Id @GeneratedValue
	private Long id;
	private String OwnerName;
	private String OwnerLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getOwnerLocation() {
		return OwnerLocation;
	}

	public void setOwnerLocation(String ownerLocation) {
		OwnerLocation = ownerLocation;
	}

}
