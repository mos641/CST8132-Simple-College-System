// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 2
// Description: Main method for reading amount of students and creating objects

import java.util.Scanner;

public class CollegeSystemTestClass {

	public static void main(String[] args) {
		//variable to store number of students and scanner
		int num;
		Scanner input = new Scanner(System.in);
		
		//ask for and store number of students
		System.out.print("Enter Number of Students: ");
		num = input.nextInt();
		
		//create array for students
		Student [] students = new Student[num];
		
		//for loop to populate array
		for(int i=0; i < num ; i++) {
			System.out.printf("Enter details of student " +(i+1)+ " \n**************************\n");
//			Student student = new Student();
			students[i]=new Student();
			students[i].readStudentInfo();
			// students [i] = student;
		}
		
		//print title and header row
		//one printf statement
		System.out.printf("List of Students \n********************\n");
		System.out.printf("%8s", "Student#");
		System.out.printf("%15s", "Name");
		System.out.printf("%20s", "Email");
		System.out.printf("%20s", "Phone");
		System.out.printf("%12s", "GPA \n");
		
		//for loop to print details of all students
		for(int i=0; i < num ; i++) {
			students[i].printStudent();			
		}
		
		//closing scanner
		input.close();
	}

}
