package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many students we want to add
		System.out.print("Enter how many students you want to add ");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		Student[] students = new Student[numberOfStudents];
		
		// Create n number of new students
		for(int i = 0 ; i < numberOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			//System.out.println(students.toString());	
		}
		
		for(int i = 0 ; i < numberOfStudents; i++) {
			System.out.println(students[i].toString());	
		}
	}	
}
