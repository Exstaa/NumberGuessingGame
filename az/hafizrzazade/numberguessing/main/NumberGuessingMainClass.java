package az.hafizrzazade.numberguessing.main;

import java.util.Scanner;

import az.hafizrzazade.numberguessing.entity.NumberEntity;

public class NumberGuessingMainClass {
	static NumberEntity numberObject = new NumberEntity();
	static int number = numberObject.getNumber();
	static Scanner sc = new Scanner(System.in);
	static int attempts = 3;
	static Integer guessedNumber;

	public static void main(String[] args) {

		while (attempts != 0) {
			Guess();
			guessedNumber = sc.nextInt();

			if (guessedNumber == number) {
				System.out.println("You won!");
				break;
			} else {
				attempts = attempts - 1;
				if (attempts != 0) {
					main(args);
					guessedNumber = sc.nextInt();
				}
			}
		}
		if(attempts == 0) {
			System.out.println("You lost");
		}
	}

	public static void Guess() {
		boolean isEven = false;
		if (number % 2 == 0) {
			isEven = true;
		}

		if (isEven) {
			System.out.println("I have guessed a number between 0 to 10 and the number is even, Guess the number:");
		} else {
			System.out.println("I have guessed a number between 0 to 10 and the number is odd, Guess the number:");
		}
		System.out.println("Attempts: " + attempts);
	}
}
