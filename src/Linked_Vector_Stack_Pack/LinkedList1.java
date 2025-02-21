package Linked_Vector_Stack_Pack;

import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ls1=new LinkedList<>();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(9);
		ls1.add(8);
		ls1.addFirst(99);
		ls1.addLast(1);
		ls1.remove(); // 99
		ls1.removeLast(); //1
		ls1.removeFirst(); //10
		
		LinkedList<Integer> ls2=new LinkedList<>();
		ls2.add(50);
		ls2.add(60);
		ls2.add(75);
		ls2.add(99);
		
		ls1.addAll(ls2);
		System.out.println(ls1.getClass());
		System.out.println(ls1.hashCode());
		ls1.offer(88);
		System.out.println(ls1.offerFirst(77));
		System.out.println(ls1.offerLast(909));
		System.out.println(ls1);
		System.out.println(ls1.getFirst());
		System.out.println(ls1.getLast());
		System.out.println(ls2.peek()); // retrieve and store element
		System.out.println(ls2.peekFirst());
		System.out.println(ls2.peekLast());
		System.out.println(ls2);
		System.out.println(ls2.poll()); // retrieve and delete element
		System.out.println(ls2.pollFirst());
		System.out.println(ls2.pollLast());
		System.out.println(ls2);
		System.out.println(ls2.clone());
		System.out.println(ls1.contains(30));
		System.out.println(ls2.equals(11));
		System.out.println(ls1.containsAll(ls2));
		System.out.println(ls1.indexOf(30));
		System.out.println(ls1.retainAll(ls2));
		
	}

}
