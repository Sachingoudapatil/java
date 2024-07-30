class RapidoRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in RapidoRunner");	
		
		
		Rapido rapido=new Rapido();
		String name=rapido.name;
		System.out.println("Rapido modelName :"+name);
		
		double price= rapido.price;
		System.out.println("Rapido price :"+price);
		
		long Model= rapido.Model;
		System.out.println("Rapido Model :"+Model);
		
		System.out.println("end main in RapidoRunner");
		
	}
}