package de.feu;

public class FizzBuzzGame {
	private static final int LAST_NUMBER = 100;
	private static final String BUZZ_WORD = "Buzz";
	private static final String FIZZ_WORD = "Fizz";
	private static final int BUZZ_NUMBER = 5;
	private static final int FIZZ_NUMBER = 3;

	public static void main(String[] args) {
		new FizzBuzzGame().runFizzBuzzGame();
	}

	void runFizzBuzzGame() {
		for (int i = 1; i <= LAST_NUMBER; i++) {
			System.out.print(determineWord(i));

			if (i < LAST_NUMBER) {
				System.out.print(", ");
			}
		}
	}

	String determineWord(int number) {
		String result = String.valueOf(number);
		if (number % FIZZ_NUMBER == 0 && number % BUZZ_NUMBER == 0) {
			result = FIZZ_WORD + BUZZ_WORD;
		} else if (number % FIZZ_NUMBER == 0) {
			result = FIZZ_WORD;
		} else if (number % BUZZ_NUMBER == 0) {
			result = BUZZ_WORD;
		}
		return result;
	}

}
