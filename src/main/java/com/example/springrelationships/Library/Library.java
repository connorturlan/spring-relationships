package com.example.springrelationships.Library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.springrelationships.Address.Address;

@Entity
public class Library {
	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	@OneToOne
	@JoinColumn(name = "address_id")
	//@RestResource(path = "libraryAddress", rel="address")
	private Address address;

	public Library(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
