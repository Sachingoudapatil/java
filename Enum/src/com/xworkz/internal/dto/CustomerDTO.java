package com.xworkz.internal.dto;

import com.xworkz.internal.constants.ProductType;

public class CustomerDTO {
	private String name;
	private String email;
	private ProductType productType;

	public CustomerDTO(String name, String email, ProductType productType) {
		super();
		this.name = name;
		this.email = email;
		this.productType = productType;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public ProductType getProductType() {
		return productType;
	}

}
