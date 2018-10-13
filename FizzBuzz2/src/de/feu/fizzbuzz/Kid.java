package de.feu.fizzbuzz;

public class Kid {
	int kidNo;

	public Kid(int kidNo) {
		super();
		this.kidNo = kidNo;
	}

	String determineWord(int number) {
		String word = String.valueOf(number);
		if (number % (Word.FIZZ.getNumber() * Word.BUZZ.getNumber()) == 0) {
			word = Word.FIZZ.toString() + Word.BUZZ.toString();
		} else if (number % Word.FIZZ.getNumber() == 0) {
			word = Word.FIZZ.toString();
		} else if (number % Word.BUZZ.getNumber() == 0) {
			word = Word.BUZZ.toString();
		}
		return kidNo + " says " + word;
	}

	void sayWord(int i) {
		System.out.print(determineWord(i));
	}
}
