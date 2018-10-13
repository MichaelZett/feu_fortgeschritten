package de.feu.fizzbuzz;

public class SmartKid extends Kid {
	public SmartKid(int kidNo) {
		super(kidNo);
	}

	@Override
	public String determineWord(int number) {
		String word = String.valueOf(number);
		if (number % (Word.FIZZ.getNumber() * Word.BUZZ.getNumber()) == 0) {
			word = Word.FIZZ.toString() + Word.BUZZ.toString();
		} else if (number % Word.FIZZ.getNumber() == 0) {
			word = Word.FIZZ.toString();
		} else if (number % Word.BUZZ.getNumber() == 0) {
			word = Word.BUZZ.toString();
		}
		return word;
	}

}
