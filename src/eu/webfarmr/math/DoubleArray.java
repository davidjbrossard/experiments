package eu.webfarmr.math;

import java.util.Random;

public class DoubleArray {
	public static void main(String[] args) {
		int numberOfGrades = 10;
		int[] grades = generateRandomGrades(numberOfGrades);
		for (int grade : grades) {
			System.out.println(grade);
		}
	}

	private static int[] generateRandomGrades(int numberOfGrades) {
		int[] grades = new int[numberOfGrades];
		for (int i = 0; i < numberOfGrades; i++) {
			grades[i] = new Random().nextInt(45) + 55;
		}
		return grades;
	}
}
