package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1
{
	int id;
	String name;
	int age;
	public Student1(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2)
	{
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}
	
}

class NameComparator implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) 
	{
		return o1.name.compareTo(o2.name);
	}
	
}

public class Comparator_Example 
{
	public static void main(String[] args) 
	{
		ArrayList<Student1> names=new ArrayList<Student1>();
		names.add(new Student1(1,"Vasanth",27));
		names.add(new Student1(2,"Melwyn",20));
		names.add(new Student1(6,"Gopi",21));
		names.add(new Student1(7,"Ram",23));
		names.add(new Student1(10,"Sam",19));
		
		Collections.sort(names,new NameComparator());
		System.out.println("Sorting by Name....");
		for(Student1 s:names)
		{
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		Collections.sort(names,new AgeComparator());
		System.out.println("\nSorting by Age....");
		for(Student1 s:names)
		{
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}

}
