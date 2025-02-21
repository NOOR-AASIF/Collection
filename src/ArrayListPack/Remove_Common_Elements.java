package ArrayListPack;

import java.util.ArrayList;

public class Remove_Common_Elements {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num1=new ArrayList();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		
		ArrayList<Integer> num2=new ArrayList();
		num2.add(30);
		num2.add(40);
		num2.add(50);
		num2.add(60);
		
		ArrayList<Integer> temp= new ArrayList<>(num1);
		
		
//		System.out.println(num1);
//		System.out.println(num2);
		
		num1.removeAll(num2);
		System.out.println(num1);
		
		
		num2.removeAll(temp);
		System.out.println(num2);
	}

}
