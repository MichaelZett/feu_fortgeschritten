package de.feu;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {
	private FizzBuzzGame testee;

	@Before
	public void setup() {
		testee = new FizzBuzzGame();
	}

	@Test
	public void shouldSayFizzForMultipleOfThree() {
		String result = testee.determineWord(3);

		assertThat(result, is("Fizz"));

		result = testee.determineWord(27);

		assertThat(result, is("Fizz"));
	}

}
