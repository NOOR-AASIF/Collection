package ArrayListPack;

import java.util.ArrayList;

class Student
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
	// Student obj=new Student(1,"Vasanth",23);

}
public class ArrayList_Usage {
	public static void main(String[] args) {
		
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(1,"Vasanth",23));
		students.add(new Student(2,"Melywn",24));
		students.add(new Student(3,"Noor",17));
		students.add(new Student(4,"Mohammed",27));
		students.add(new Student(5,"Aasif",55));
		
		//System.out.println(students);
		for(Student s:students)
		{
			System.out.println(s.id+" "+s.name+" "+s.age); 
		}
		for(Student s:students)
		{
			if(s.age>=25)
			{
				System.out.println(s.id+" "+s.name+" "+s.age); 
			}
		}
		for(Student s:students)
		{
			if(s.name.startsWith("A"))
			{
				System.out.println(s.id+" "+s.name+" "+s.age); 
			}
		}
		
		
	}

}
