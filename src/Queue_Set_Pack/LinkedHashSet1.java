package Queue_Set_Pack;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer>ls=new LinkedHashSet();
		ls.add(3);
		ls.add(2);
		ls.add(6);
		ls.add(5);
		ls.add(4);
		ls.add(null);
		System.out.println(ls);
		
		
		LinkedHashSet<Integer>ls2=new LinkedHashSet<>();
		ls2.add(3);
		ls2.add(20);
		ls2.add(60);
		ls2.add(50);
		ls2.add(40);
		System.out.println(ls2);
		
		//ls.retainAll(ls2);      // Retrieve common value
		//	hash.addAll(hash1);   // adding two objects and remove duplicate
			ls.removeAll(ls2);    // Remove hash-hash1
			System.out.println(ls);
	}

}
