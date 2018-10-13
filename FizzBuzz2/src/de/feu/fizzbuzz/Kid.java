package de.feu.fizzbuzz;

public class Kid {
	int kidNo;

	public Kid(int kidNo) {
		super();
		this.kidNo = kidNo;
	}

	String determineNextWord(int i) {
		String word = String.valueOf(i);
		if (i % 15 == 0) {
			word = Word.FIZZ.toString() + Word.BUZZ.toString();
		} else if (i % 3 == 0) {
			word = Word.FIZZ.toString();
		} else if (i % 5 == 0) {
			word = Word.BUZZ.toString();
		}
		return kidNo + " says " + word;
	}

	void sayWord(int i) {
		System.out.print(determineNextWord(i));
	}
}
