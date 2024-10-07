package com.xworkz.internal.runner;

import com.xworkz.internal.constants.ProductType;
import com.xworkz.internal.dto.CustomerDTO;

public class CustomerDTORunner {

	public static void main(String[] args) {
		CustomerDTO customer = new CustomerDTO("sachin p", "sachin1@gmail.com", ProductType.FURRNITURE);
		System.out.println("Customer Name: " + customer.getName());
		System.out.println("Customer Email: " + customer.getEmail());
		System.out.println("Product Type: " + customer.getProductType());

	}

}
