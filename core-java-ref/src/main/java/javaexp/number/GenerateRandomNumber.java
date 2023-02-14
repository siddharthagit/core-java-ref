package javaexp.number;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		System.out.println(GenerateRandomNumber.generateRandomInteger(35, 40));
		System.out.println(GenerateRandomNumber.generateRandomIntegerII(35, 40));

	}

	private static int generateRandomInteger(int rangeStart, int rangeEnd) {
		// generate double between 0.0 and 1.0
		double r = Math.random();
		Integer result = (int) (rangeStart + r * (rangeEnd - rangeStart));
		return result;
	}

	private static int generateRandomIntegerII(int rangeStart, int rangeEnd) {
		// generate double between 0.0 and 1.0
		Random random = new Random();
		double r = random.nextDouble();
		Integer result = (int) (rangeStart + r * (rangeEnd - rangeStart));
		return result;
	}

}
