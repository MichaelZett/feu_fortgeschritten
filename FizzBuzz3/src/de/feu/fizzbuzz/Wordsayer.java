package de.feu.fizzbuzz;

public interface Wordsayer {
	String determineWord(int number);

	default void sayWord(int number) {
		System.out.print(determineWord(number));
	}
}
