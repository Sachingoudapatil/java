class CabCompanyRunner{
	public static void main (String[] args)
	{
		System.out.println("dtart main in CabCompanyRunner");	
		
		
		CabCompany cabCompany=new CabCompany();
		String companyname=cabCompany.companyname;
		System.out.println("CabCompany companyname :"+companyname);
		
		double investment= cabCompany.investment;
		System.out.println("CabCompany investment :"+investment);
		
		long lunched= cabCompany.lunched;
		System.out.println("CabCompany lunched :"+lunched);
		
		System.out.println("end main in CabCompanyRunner");
		
	}
}