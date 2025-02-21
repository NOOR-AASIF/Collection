package ArrayListPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Remove_Element_Iterator {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to remove");
		int num=sc.nextInt();
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		
	
		Iterator it=number.iterator();
		while(it.hasNext())
		{
			int n=(int) it.next();
			
			if(n==num)
			{
				it.remove();
			}
			
		}
		
		System.out.println(number);
		
		
		
		List<String>fruits=Arrays.asList("Watermelon","apple","mango","orange");
		System.out.println(fruits);
		
		ArrayList<String>name=new ArrayList();
		name.add("Vasanth");
		name.add("Ragul");
		
		name.clear();
		System.out.println(name);
		
	}

}
