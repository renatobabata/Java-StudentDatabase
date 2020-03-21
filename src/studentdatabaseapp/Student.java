package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	
	// Constructor : prompt user to entender student's name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextLine();
		System.out.println(firstName+" "+lastName+" "+gradeYear);	
		
	}
	
}