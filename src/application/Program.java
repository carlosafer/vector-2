package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many students? ");
		int n = input.nextInt();
		Student[] vector = new Student[n];

		for (int i = 0; i < n; i++) {
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Grade: ");
			double grade = input.nextDouble();
			vector[i] = new Student(name, grade);
		}

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i].getName() + " " + vector[i].getGrade());
		}

		double sum = 0.0;
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i].getGrade();
		}

		double avg = sum / n;
		System.out.println();
		System.out.printf("Classroom avg: %.2f%n", avg);
	}

}
