package CollectionsClass;

import java.util.EnumSet;
import java.util.Set;

enum level
{
	BEGINNER("B"),INTERMIDIATE("I"),ADVANCE("A");
	
	String abbr;
	level(String string) 
	{
		abbr=string;
	}
	
	public String getAbbr()
	{
		return abbr;
	}
}
public class Enum_Set2class
{
	public static void main(String[] args)
	{
		Set<level> l=EnumSet.of(level.ADVANCE,level.BEGINNER);
		System.out.println(l);
		
		level l1=level.BEGINNER;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
		
		
	}
}
