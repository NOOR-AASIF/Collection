package CollectionsClass;

import java.util.EnumMap;
import java.util.Map;

public class Enum_MapClass
{
	public static void main(String[] args) 
	{
		EnumMap<days,Integer> ss=new EnumMap<>(days.class);
		System.out.println(ss);
		ss.put(days.FRIDAY, 1);
		ss.put(days.MONDAY, 2);
		ss.put(days.SUNDAY, 3);
		
		System.out.println(ss);
		
		for(Map.Entry ll: ss.entrySet())
		{
			System.out.println(ll.getKey()+" "+ll.getValue());
		}
	}
}
