package com.example.springrelationships.Address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.springrelationships.Library.Library;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String location;

	@OneToOne(mappedBy="address")
	private Library library;

	public Address(String location, Library library) {
		this.location = location;
		this.library = library;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
}
