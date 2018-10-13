package de.feu.fizzbuzz;

public abstract class Kid implements Wordsayer {
	private int kidNo;

	public Kid(int kidNo) {
		super();
		this.kidNo = kidNo;
	}

	public int getKidNo() {
		return kidNo;
	}

}