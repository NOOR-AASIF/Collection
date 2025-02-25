package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student obj) 
	{
		if(age== obj.age)
			return 0;
		else if(age<obj.age) // < = big to small, > = small to big
			return 1;
		else 
			return -1;
		
	}
	
	
	
}
public class Comparable_Example {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(1,"Vasanth",27));
		students.add(new Student(2,"Melwyn",20));
		students.add(new Student(6,"Gopi",21));
		students.add(new Student(7,"Ram",23));
		students.add(new Student(10,"Sam",19));
		
		//System.out.println(students);
		Collections.sort(students);
		for(Student s: students)
		{
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}

}
