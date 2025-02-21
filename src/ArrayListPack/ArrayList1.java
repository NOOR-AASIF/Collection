package ArrayListPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Vasanth");
		arraylist.add("Melywn");
		arraylist.add("Kamal");
		arraylist.add("Rajini");
		arraylist.add(1,"Aasif");
		arraylist.set(2, "Ragul");
		arraylist.add("Rajini");
		
		
		String arraylistarray[]=arraylist.toArray(new String[0]);  // arraylist to array conversion
		for(String al:arraylistarray)
		{
			System.out.println(al);
		}
		
		if(arraylist.contains("vasanth"))   // data exist or not
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Absent");
		}
		
		Collections.sort(arraylist); // ascending order sorting
		System.out.println(arraylist);
		
		System.out.println(arraylist.get(3));
		ArrayList <String> arraylist2=new ArrayList<String>();
		System.out.println(arraylist2.isEmpty());
		arraylist2.add("Melwyn");
		arraylist2.add("Sanjay");
		arraylist2.add("Udayashree");
		arraylist2.add("Ramji");
		System.out.println(arraylist2.isEmpty());
		System.out.println(arraylist2);
		
		arraylist.addAll(arraylist2);
		System.out.println("Overlist"+arraylist); 
		System.out.println("Size of :"+arraylist.size());
		System.out.println("Hashcode of : "+arraylist.hashCode());
		System.out.println("index position of :"+arraylist.indexOf("Rajini"));
		System.out.println("last index position of : "+arraylist.lastIndexOf("Rajini"));
		System.out.println("sublist of :"+arraylist.subList(0, 3));  // retrieve the 0 index to 2 index
		System.out.println("Contains :"+arraylist.contains("Ragul"));
		System.out.println("Contains : "+arraylist.contains("melwyn"));
		System.out.println("equals of :"+arraylist.equals("hello"));
		System.out.println("Output in list format....");
		System.out.println(arraylist+" \n");
		System.out.println("remove using index position  :"+arraylist.remove(0)); 
		System.out.println("remove using value :"+arraylist.remove("Vasanth"));
		System.out.println("output using for each loop....");
		for(String s:arraylist)
		{
			System.out.println(s);
		}
		System.out.println("\n");
		System.out.println("Output using iterator.......");
		Iterator it=arraylist.iterator();
		
		while(it.hasNext()) // data present or not 
		{
			System.out.println(it.next());  // retrieve the data and move the cursor to next line
		}
	}

}
