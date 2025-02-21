package Linked_Vector_Stack_Pack;

import java.util.LinkedList;

public class Print_odd {
	
	public static void even(LinkedList<Integer> list)
	{
		for(Integer i:list)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void odd(LinkedList<Integer> list)
	{
		for(Integer i:list)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		LinkedList<Integer>it=new LinkedList();
		it.add(55);
		it.add(20);
		it.add(30);
		
		//odd(it);
		even(it);
	}

}
