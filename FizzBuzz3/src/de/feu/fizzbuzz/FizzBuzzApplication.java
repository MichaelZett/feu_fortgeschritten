package de.feu.fizzbuzz;

public class FizzBuzzApplication {

	public static void main(String[] args) {
		Classroom room = new Classroom();
		for (int i = 1; i <= 5; i++) {
			room.enter(createKid(i));
		}
		room.startGame();
	}

	private static Kid createKid(int i) {
		if (i % 2 == 0) {
			System.out.println("Smart");
			return new SmartKid(i);
		} else {
			System.out.println("Dumb");
			return new DumbKid(i);
		}
	}

}
