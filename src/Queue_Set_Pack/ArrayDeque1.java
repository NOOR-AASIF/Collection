package Queue_Set_Pack;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {
		
		ArrayDeque<Integer>ad=new ArrayDeque<>();
		ad.add(50);
		ad.add(60);
		ad.add(75);
		ad.add(40);
		
		System.out.println(ad);
		System.out.println(ad); // ordered based on Priority
		
		System.out.println(ad.peek()); // retrieve and store element

		System.out.println(ad);
		System.out.println(ad.poll()); // retrieve and delete element

		System.out.println(ad);

		System.out.println(ad.contains(30));
		System.out.println(ad.equals(11));
		System.out.println(ad.containsAll(ad));
		System.out.println(ad.retainAll(ad));
	}

}
