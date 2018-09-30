package de.feu.fizzbuzz;

public class Kid {
	String determineWord(int i) {
		String word = String.valueOf(i);
		if (i % 15 == 0) {
			word = "FizzBuzz";
		} else if (i % 3 == 0) {
			word = "Fizz";
		} else if (i % 5 == 0) {
			word = "Buzz";
		}
		return word;
	}

	void sayWord(int i) {
		System.out.print(determineWord(i));
		if (i < 100) {
			System.out.print(", ");
		}
	}
}
