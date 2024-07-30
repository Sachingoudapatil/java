class AutorikshaRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in AutorikshaRunner");	
		
		
		Autoriksha autoriksha=new Autoriksha();
		String modelName=autoriksha.modelName;
		System.out.println("Autoriksha modelName :"+modelName);
		
		double price= autoriksha.price;
		System.out.println("Autoriksha price :"+price);
		
		long Model= autoriksha.Model;
		System.out.println("Autoriksha Model :"+Model);
		
		System.out.println("end main in AutorikshaRunner");
		
	}
}