package Linked_Vector_Stack_Pack;

import java.util.LinkedList;

public class Find_Mid_Element {
	
	public static void findMiddle(LinkedList<Integer> list)  // 10,20,30
	{
	    int slow = 0, fast = 0;
	    while (fast < list.size() - 1 && fast + 1 < list.size()) // 0<2 && 1<3  || 2<2 && 3<3
	    {
	        slow++;   //  1
	        fast += 2; // 2
	    }
	    System.out.println("Middle Element: " + list.get(slow));  // 1
	}
	
	public static void mid(LinkedList<Integer> list)
	{
		 int n=list.size()/2;  // 7/2=3
		 System.out.println("Middle Element: " + list.get(n)); 
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer>it=new LinkedList();
		it.add(55);
		it.add(20);
		it.add(30);
		
		mid(it);
	}

}
