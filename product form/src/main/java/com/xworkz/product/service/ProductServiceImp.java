package com.xworkz.product.service;

import com.xworkz.product.Dto.ProductDto;

public class ProductServiceImp implements ProductService{

	@Override
	public boolean isValidAndSave(ProductDto productDto) {
		// TODO Auto-generated method stub
				boolean valid=true;
				if(productDto!=null) {
				String companyName=productDto.getCompanyName();
				if(companyName!=null && !companyName.isEmpty() && companyName.length()>3 && companyName.length()<30) {
					System.out.println("companyName is valid");
				}
				else {
					System.out.println("companyName is not valid");
					valid=false;
				}
				
				String productName=productDto.getProductName();
				if(productName!=null && !productName.isEmpty() && productName.length()>3 && companyName.length()<30) {
					System.out.println("productName is valid");
				}
				else {
					System.out.println("productName is not valid");
					valid=false;
				}
				
				int productQuantiy=productDto.getProductQuantiy();
				if(productQuantiy>0 && productQuantiy<10) {
					System.out.println("productQuantiy is valid");
				}
				else {
					System.out.println("productQuantiy is not valid");
					valid=false;
				}
					
				double productCost=productDto.getProductCost();
				if(productCost>=100) {
					System.out.println("productCost is valid");
				}
				else {
					System.out.println("productCost is not valid");
					valid=false;
				}
				
				}
				return valid;
			}

	}


