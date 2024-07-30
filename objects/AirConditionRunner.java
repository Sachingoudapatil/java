class AirConditionRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in AirConditionRunner");	
		
		
		AirCondition airCondition=new AirCondition();
		String Brand=airCondition.Brand;
		System.out.println("AirCondition brand :"+Brand);
		
		double price= airCondition.price;
		System.out.println("AirCondition price :"+price);
		
		int generation=airCondition.generation;
		System.out.println("AirCondition generation :"+generation);
		
		System.out.println("end main in AirConditionRunner");
		
	}
}