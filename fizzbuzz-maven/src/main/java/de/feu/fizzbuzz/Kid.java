package de.feu.fizzbuzz;

public class Kid {
	private static final String BUZZ_WORD = "Buzz";
	private static final String FIZZ_WORD = "Fizz";
	private static final int BUZZ_NUMBER = 5;
	private static final int FIZZ_NUMBER = 3;

	String determineWord(int number) {
		String word = String.valueOf(number);
		if (number % (FIZZ_NUMBER * BUZZ_NUMBER) == 0) {
			word = FIZZ_WORD + BUZZ_WORD;
		} else if (number % FIZZ_NUMBER == 0) {
			word = FIZZ_WORD;
		} else if (number % BUZZ_NUMBER == 0) {
			word = BUZZ_WORD;
		}
		return word;
	}

	void sayWord(int number) {
		System.out.print(determineWord(number));
	}
}
