package Queue_Set_Pack;

import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(6);
		ts.add(5);
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.size());
		System.out.println(ts.subSet(1,true ,3,true)); // index 1,2
		System.out.println(ts.headSet(4));
		System.out.println(ts.tailSet(4));
		System.out.println(ts.higher(2));
		System.out.println(ts.lower(2));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
	}

}
