package de.feu.fizzbuzz;

public enum Word {
	FIZZ("Fizz", 3), BUZZ("Buzz", 5);

	private String stringRepresentation;
	private int number;

	private Word(String stringRepresentation, int number) {
		this.stringRepresentation = stringRepresentation;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return stringRepresentation;
	}
}
