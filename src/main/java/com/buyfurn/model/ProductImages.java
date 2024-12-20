package com.buyfurn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductImages {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String type;
	@Column(length = 50000000)
	private byte[] picBytes;
	
	
	public ProductImages(String name, String type, byte[] picBytes) {
		super();
		this.name = name;
		this.type = type;
		this.picBytes = picBytes;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public byte[] getPicBytes() {
		return picBytes;
	}


	public void setPicBytes(byte[] picBytes) {
		this.picBytes = picBytes;
	}


	public ProductImages() {
		super();
	}
	

}
