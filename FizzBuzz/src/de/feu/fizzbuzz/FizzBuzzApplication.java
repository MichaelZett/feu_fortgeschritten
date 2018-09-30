package de.feu.fizzbuzz;

public class FizzBuzzApplication {

	public static void main(String[] args) {
		Kid kid = new Kid();
		for (int i = 1; i <= 100; i++) {
			kid.sayWord(i);
		}
	}

}
