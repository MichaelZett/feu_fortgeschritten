package de.feu.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class KidTest {
	Kid testee = new Kid();

	@Test
	public void shouldSayFizzForMultipleOfThree() {
		String result = testee.determineWord(3);

		assertThat(result, is("Fizz"));

		result = testee.determineWord(27);

		assertThat(result, is("Fizz"));
	}

}
