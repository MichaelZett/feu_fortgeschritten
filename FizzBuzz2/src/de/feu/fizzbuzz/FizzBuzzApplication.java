package de.feu.fizzbuzz;

public class FizzBuzzApplication {

	public static void main(String[] args) {
		Classroom room = new Classroom();
		for (int i = 1; i <= 5; i++) {
			room.enter(new Kid(i));
		}
		room.startGame();
	}

}
