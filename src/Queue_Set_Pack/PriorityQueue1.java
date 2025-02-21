package Queue_Set_Pack;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("Vasanth");
		pq.add("Melwyn");
		pq.add("Sanjay");
		pq.add("Ramji");
		
		System.out.println(pq);
		
		PriorityQueue<Integer>pq1=new PriorityQueue<Integer>();
		pq1.add(10);
		pq1.add(5);
		pq1.add(30);
		pq1.add(25);
		//pq1.add(null);
		
		System.out.println(pq1); // ordered based on Priority
		
		System.out.println(pq1.peek()); // retrieve and store element

		System.out.println(pq1);
		System.out.println(pq1.poll()); // retrieve and delete element

		System.out.println(pq1);

		System.out.println(pq.contains(30));
		System.out.println(pq1.equals(11));
		System.out.println(pq.containsAll(pq1));
		System.out.println(pq.retainAll(pq1));
	}
	
}
