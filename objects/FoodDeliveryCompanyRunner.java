class FoodDeliveryCompanyRunner{
	public static void main (String[] args)
	{
		System.out.println("start main in FoodDeliveryCompanyRunner");	
		
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String companyname=foodDeliveryCompany.companyname;
		System.out.println("FoodDeliveryCompany companyname :"+companyname);
		
		double Price= foodDeliveryCompany.Price;
		System.out.println("FoodDeliveryCompany Price :"+Price);
		
		int noOfitems= foodDeliveryCompany.noOfitems;
		System.out.println("FoodDeliveryCompany noOfitems :"+noOfitems);
		
		System.out.println("end main in FoodDeliveryCompanyRunner");
		
	}
}