package Queue_Set_Pack;

import java.util.HashSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer>hash=new HashSet<>();
		hash.add(3);
		hash.add(2);
		hash.add(6);
		hash.add(5);
		hash.add(4);
		
		HashSet<Integer>hash1=new HashSet<>();
		hash1.add(3);
		hash1.add(20);
		hash1.add(60);
		hash1.add(50);
		hash1.add(40);
		
	//	hash.retainAll(hash1);  // Retrieve common value
	//	hash.addAll(hash1);     // adding two objects and remove duplicate
		hash.removeAll(hash1);  // Remove hash-hash1
		System.out.println(hash);
		
		
	}

}
