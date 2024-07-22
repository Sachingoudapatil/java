 class MovieProducerRunner{
	public static void main (String[] args)
	{
		System.out.println("running main in  movieProducerRunner");
		
        String kgfproducer=movieProducer.moviename("kgf"); 
        System.out.println("kgfproducer :"+kgfproducer);
		
		String kalikiProducer=movieProducer.moviename("kalki");
        System.out.println("kalikiProducer :"+kalikiProducer);

 
 
       String kabzaaproducer=movieProducer.moviename("kabzaa");
       System.out.println("kabzaaproducer :"+kabzaaproducer);
 
 String rrrproducer=movieProducer.moviename("RRR");
 System.out.println("rrrproducer :"+rrrproducer);
 
 String pushpaproducer=movieProducer.moviename("pushpa");
 System.out.println("pushpaproducer :"+pushpaproducer);
 
 String producerName=movieProducer.moviename("animal");
 System.out.println("producerName:"+producerName);
}
} 