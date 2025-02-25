package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_class {
	
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Vasanth");
		name.add("Melwyn");
		name.add("Sanjay");
		name.add("Gopi");
		name.add("Pooja");
		
		System.out.println(name);
		Collections.addAll(name, "Sudhakar","Rani","Raja","Mama");
		System.out.println(name);
		
		String arr[]= {"Vijay","Noor","Mohammed","Ramji"};
		Collections.addAll(name, arr);
		System.out.println(name);
		
		System.out.println(Collections.max(name));
		System.out.println(Collections.min(name));
		Collections.sort(name);
		System.out.println(name);
		
		ArrayList<String> copy1=new ArrayList<>();
		
		Collections.copy(name, copy1);
		System.out.println(copy1);
		
		Collections.reverse(name);
		System.out.println(name);
		
		Collections.swap(name, 0, 2);
		System.out.println(name);
		
		Collections.shuffle(name);
		System.out.println(name);
		
		
		
	}

}
