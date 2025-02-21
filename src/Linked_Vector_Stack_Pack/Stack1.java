package Linked_Vector_Stack_Pack;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.pop();
		stack.pop();
		System.out.println(stack);
		
		for(Integer i:stack)
		{
			System.out.println(i);
		}
		
		Iterator it=stack.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
	}

}
