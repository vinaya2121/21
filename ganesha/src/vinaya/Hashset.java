package vinaya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		al.add("vinaya");
		al.add(21);
		al.add("Sonawane");
		al.add(05);
		al.add("pallavi Sonawane");
		al.add("vinaya");
		al.add(21);
		al.add("Sonawane");
		al.add(05);
		al.add("pallavi Sonawane");
		
		System.out.println(al);
		
		//HashSet hs = new HashSet(al);
		//System.out.println(hs);
		
		Iterator ir =   al.iterator();
		for(Object str:al) {
			System.out.println(str);
		}
		
		
	}

}
