class BMTCRunner{
	public static void main (String[] args)
	{
		System.out.println("start main in BMTCRunner");	
		
		
		BMTC bMTC=new BMTC();
		String Governamentname=bMTC.Governamentname;
		System.out.println("BMTC Governament :"+Governamentname);
		
		double TicketPrice= bMTC.TicketPrice;
		System.out.println("BMTC TicketPrice :"+TicketPrice);
		
		long BusNumber= bMTC.BusNumber;
		System.out.println("BMTC BusNumber :"+BusNumber);
		
		System.out.println("end main in BMTCRunner");
		
	}
}