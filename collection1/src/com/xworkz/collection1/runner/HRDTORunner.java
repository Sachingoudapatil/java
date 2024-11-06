package com.xworkz.collection1.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.xworkz.collection1.dto.HRDto;

public class HRDTORunner {
	public static void main(String[] args) {

		HRDto hrDTO1=new HRDto("sunil","BE",2 ,"gadag");
		HRDto hrDTO2=new HRDto("mohan","Bcom",1 ,"haveri");
		HRDto hrDTO3=new HRDto("sanju","MA",4,"koppal");
		HRDto hrDTO4=new HRDto("bharat","Mtech",6 ,"banglore");
		HRDto hrDTO5=new HRDto("kamlesh","BE",8,"ramnagar");
		HRDto hrDTO6=new HRDto("ajay","Mcom",1 ,"bagalkot");
		HRDto hrDTO7=new HRDto("charan","MA",0,"kolar");
		HRDto hrDTO8=new HRDto("deekshit","Mcom",1,"chikkamagalore");
		HRDto hrDTO9=new HRDto("jayant","Mtech",9,"belgavi");
		HRDto hrDTO10=new HRDto("prakash","BE",2 ,"hubli");

		Collection<HRDto> collection=new LinkedList<HRDto>();
		collection.add(hrDTO1);
		collection.add(hrDTO2);
		collection.add(hrDTO3);
		collection.add(hrDTO4);
		collection.add(hrDTO5);
		collection.add(hrDTO6);
		collection.add(hrDTO7);
		collection.add(hrDTO8);
		collection.add(hrDTO9);
		collection.add(hrDTO10);
		
		collection
		.stream()
		.filter(ref->ref.getLocation().startsWith("c"))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName()));
		System.out.println();

		collection
		.stream()
		.filter(ref->ref.getTotalExp()>5)
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName()));
		System.out.println();
		
		collection
		.stream()
		.filter(ref->ref.getName().endsWith("r"))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName()));
		System.out.println();
		
		collection
		.stream()
		.map(ref->ref.getLocation())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.map(ref->ref.getName())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		

		collection
		.stream()
		.sorted((ref1,ref2)->ref1.getName().compareTo(ref2.getName()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();

		collection
		.stream()
		.sorted((ref1,ref2)->ref1.getQualification().compareTo(ref2.getQualification()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();

		collection
		.stream()
		.sorted((ref1,ref2)->Double.compare(ref2.getTotalExp(),ref1.getTotalExp()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();

		java.util.Iterator<HRDto> iterator=collection.iterator();
		
		System.out.println("iterator");
		while (iterator.hasNext()) {
			HRDto ref = iterator.next();
			if(ref.getName().startsWith("a"))
			System.out.println(ref);
		}

        LinkedList<HRDto> collection1=(LinkedList<HRDto>)collection;
		
		ListIterator<HRDto> listIterator=collection1.listIterator(10);
		
		System.out.println("listTterator");
		
		while (listIterator.hasPrevious()) {
			HRDto ref = listIterator.previous();	
			System.out.println(ref);
		}
		
		
	}

}

