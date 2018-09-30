package de.feu.fizzbuzz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KidTest {
	Kid testee = new Kid(1);

	@Test
	public void shouldDetermineFizz() {
		assertTrue(testee.determineNextWord(3).equals("Fizz"));
	}

}
