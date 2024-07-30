class RupeeRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in RupeeRunner");	
		
		
		Rupee rupee=new Rupee();
		String country=rupee.country;
		System.out.println("Rupee brand :"+country);
		
		double price= rupee.price;
		System.out.println("Rupee price :"+price);
		
		long year= rupee.year;
		System.out.println("Rupee year :"+year);
		
		System.out.println("end main in RupeeRunner");
		
	}
}