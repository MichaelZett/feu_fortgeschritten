package de.feu.fizzbuzz;

public interface Kid {
	String determineNextWord(int i);

	default void sayWord(int i) {
		System.out.print(determineNextWord(i));
	}
}
