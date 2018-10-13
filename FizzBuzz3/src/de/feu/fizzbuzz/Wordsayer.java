package de.feu.fizzbuzz;

public interface Wordsayer extends IdentityCarrier {
	String determineWord(int number);

	default void sayWord(int number) {
		System.out.print(getId() + " says " + determineWord(number));
	}
}
