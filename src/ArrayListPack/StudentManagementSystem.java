package ArrayListPack;

import java.util.ArrayList;
import java.util.Scanner;

class Student1
{
	private int id ;
	private String name;
	private int age;
	
	
	public Student1(int id, String name, int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

//System.out.println("1. Add Student");
//System.out.println("2. View All Students");
//System.out.println("3. Search Student by ID");
//System.out.println("4. Remove Student");
//System.out.println("5. Exit");
//System.out.print("Choose an option: ");

public class StudentManagementSystem 
{
	private static Scanner sc=new Scanner(System.in);
	private static ArrayList<Student1>students=new ArrayList<>();
	public static void main(String[] args) 
	{
		while(true) {
		System.out.println("1. Add Student");
		System.out.println("2. View All Students");
		System.out.println("3. Search Student by ID");
		System.out.println("4. Remove Student");
		System.out.println("5. Exit");
		System.out.print("Choose an option: ");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1: addStudent();break;
		case 2: ViewStudents();break;
		case 3: searchStudent();break;
		case 4: removeStudent();break;
		case 5: sc.close();System.out.println("ThankYou GoodBye!!! Visit Again..");return; 
		default:System.out.println("Invalid input...");break;
		}
		}
		
	}






	private static void addStudent()
	{
		//System.out.println("add Student");
		
		System.out.println("\nEnter your id : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Name : ");
		String name=sc.nextLine();
		System.out.println("Enter your Age : ");
		int age=sc.nextInt();
		students.add(new Student1(id,name,age));
		System.out.println("Student details added...\n");
		
	}
	private static void ViewStudents()
	{
		//System.out.println("View Student");
		if(students.isEmpty())
		{
			System.out.println("Student list is Empty..");
		}
		else
		{
			System.out.println("\nStudents Record...\n");
			for(Student1 ss:students)
			{
				System.out.println(ss);
			}
		}
	}
	
	private static void searchStudent() 
	{
		//System.out.println("Search Student");
		System.out.println("Enter the id  : ");
		int id=sc.nextInt();
		
		for(Student1 ss:students)
		{
			if(ss.getId()==id)
			{
				System.out.println(ss);
			}
		}
		
	}
	
	private static void removeStudent() 
	{
		System.out.print("Enter Student ID to Remove: ");
        int id = sc.nextInt();
        for (Student1 student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
		
		
	

}
