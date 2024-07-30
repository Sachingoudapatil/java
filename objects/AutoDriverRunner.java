class AutoDriverRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in AutoDriverRunner");
		
		AutoDriver autoDriver=new AutoDriver();
		int age=autoDriver.age;
		System.out.println("autodriver age :"+age);
		
		String name=autoDriver.name;
		System.out.println("autodriver name :"+name);
		
		long phoneNo=autoDriver.phoneNo;
		System.out.println("autodriver phoneNo :"+name);
		
		
		
		System.out.println("end main in AutoDriverRunner");
		
	}
}