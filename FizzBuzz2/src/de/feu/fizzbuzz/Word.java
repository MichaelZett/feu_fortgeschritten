package de.feu.fizzbuzz;

public enum Word {
	FIZZ("Fizz"), BUZZ("Buzz");

	private String value;

	private Word(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
