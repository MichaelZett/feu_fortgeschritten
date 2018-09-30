package de.feu.fizzbuzz;

public class DumbKid implements Kid {
	int kidNo;

	public DumbKid(int kidNo) {
		super();
		this.kidNo = kidNo;
	}

	@Override
	public String determineNextWord(int i) {
		return String.valueOf(i);
	}

}
