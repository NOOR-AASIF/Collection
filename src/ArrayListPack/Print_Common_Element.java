package ArrayListPack;

import java.util.ArrayList;

public class Print_Common_Element {
	
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
		
//		1.way one using retainAll()
//		ArrayList<Integer>temp=new ArrayList<>(num1);
//		temp.retainAll(num2);
//		System.out.println(temp);
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
//		2.way two using for loop
		
		ArrayList<Integer>commonvalues=new ArrayList<>();
		
		for(Integer summa : num1)
		{
			if(num2.contains(summa))
			{
				commonvalues.add(summa);
			}
		}
		
		System.out.println(commonvalues);
		
		
	}

}
