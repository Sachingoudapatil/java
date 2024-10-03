package com.xworkz.runner;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.internal.ProductType;

public class CustomerDTORunner {

	public static void main(String[] args) {
		CustomerDTO customer = new CustomerDTO("sachin p", "sachin1@gmail.com", ProductType.FURRNITURE);
		System.out.println("Customer Name: " + customer.getName());
		System.out.println("Customer Email: " + customer.getEmail());
		System.out.println("Product Type: " + customer.getProductType());

	}

}
