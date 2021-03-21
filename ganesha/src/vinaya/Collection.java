package vinaya;

import java.util.ArrayList;

public class Collection {
	

	public static void main1(String[] args) {
	
		ArrayList al= new ArrayList();
		al.add("Vinaya");//index=0
		al.add(100);//index=1
		al.add("Sonawane");//index=2
		al.add("This is my Dream");//index=3
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Vinaya"));
		System.out.println(al.get(0));
		System.out.println(al.lastIndexOf(100));
		al.add(1, '4');//To add the data in the existing data.
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.set(1, 21);
		System.out.println(al);
		al.add("Vinaya");
		System.out.println(al);
		
	}

}
