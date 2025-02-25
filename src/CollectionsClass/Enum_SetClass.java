package CollectionsClass;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;


public class Enum_SetClass 
{
	public static void main(String[] args) 
	{
		//Taken selected days enum
		Set<days> s=EnumSet.of(days.SATURDAY,days.SUNDAY);
		s.add(days.FRIDAY);
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//taken all days from the days enum
		Set<days> s1=EnumSet.allOf(days.class);
		
		System.out.println(s1);
		
		//select none of the item from the days enum
		Set<days> s2=EnumSet.noneOf(days.class);
		
		System.out.println(s2);
	}
}
