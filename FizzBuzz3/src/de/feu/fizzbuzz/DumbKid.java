package de.feu.fizzbuzz;

public class DumbKid extends Kid {
	public DumbKid(int kidNo) {
		super(kidNo);
	}

	@Override
	public String determineWord(int i) {
		return getKidNo() + " says " + String.valueOf(i);
	}

}
