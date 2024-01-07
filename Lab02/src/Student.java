// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 2
// Description: Class for creating Students and calculating and reading information

import java.util.Scanner;

public class Student {
	// instance variables
	private int studentNumber;
	private Person student;
	private double gpa;

	// constructor with parameters
	public Student(int studentNumber, Person student, double gpa) {
		this.studentNumber = studentNumber;
		this.student = student;
		this.gpa = gpa;

	}

	// no argument constructor
	public Student() {
		
	}

	// method to read info
	public void readStudentInfo() {
		// variables to store input information and scanner
		String firstName;
		String lastName;
		String emailId;
		long phoneNumber;
		Scanner input = new Scanner(System.in);

		// ask for information and create Person with stored information
		System.out.print("Enter student number: ");
		studentNumber = input.nextInt();

		System.out.print("Enter first name: ");
		firstName = input.next();

		System.out.print("Enter last name: ");
		lastName = input.next();

		System.out.print("Enter email Id: ");
		emailId = input.next();

		System.out.print("Enter phone number: ");
		phoneNumber = input.nextLong();

		// create person with acquired information
		student = new Person(firstName, lastName, emailId, phoneNumber);

		// call readMarks to read marks
		readMarks();
	}

	// method to read marks and calculate
	public void readMarks() {
		// array to store marks and scanner
		double[] marks;
		Scanner input = new Scanner(System.in);

		// ask for the number of courses and create array length
		System.out.print("Enter number of courses: ");
		marks = new double[input.nextInt()];

		// for loop to populate array
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter mark " + (i + 1) + ": ");
			marks[i] = input.nextInt();
		}
		
		// calling calculateGpa to calculate the gpa
		calculateGpa(marks);
	}

	// method to calculate gpa
	private void calculateGpa(double[] marks) {
		// variable to store marks
		double total = 0;

		// for loops to add all marks together
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}

		// calculate and store the gpa
		gpa = ((total / marks.length) / 100 ) * 4;
	}

	// method to print all student info
	public void printStudent() {
		System.out.printf("%8s", studentNumber + " |");
		System.out.printf("%24s", student.getName() + " |");
		System.out.printf("%18s", student.getEmail() + " |");
		System.out.printf("%18s", student.getPhoneNumber() + " |");
		System.out.printf("%2s%.2f%2s", " ", gpa, " |\n");
	}

}
