package by.epam.jonline.task_counter;

public class UserView {

	public void win(int result) {
		System.out.println("Bingo!!! Totall credit: " + result + "$");
		System.out.println(">>");
	}

	public void loose(int result) {
		System.out.println("We are loosing money! Totall credit: " + result + "$");
		System.out.println(">>");
	}

	public void menuInfo(Roulette roulette) {
		System.out.println("Let's play a game! For the start you have " + roulette.getSum() + " credit for free.\n"
				+ "The wrong choice - lost a 1$. The right choice - doubles credit.\n"
				+"In any time you can stop the game - input \"stop\".\n"
				+ "Place your bet! Choose number from 1 to 5 >> ");
	}

	public void anotherGuess() {
		System.out.println("Try one more time!");
	}

	public void thatsAll() {
		System.out.println("That's all! No more money!");
	}
	public void winner(Roulette roulette) {
		System.out.println("Money are always money! It's your cash: " + roulette.getSum() + "$");
		
	}
	
	public void warning() {
		System.out.println("Just choose a number! From 1 to 5 or stop the Game >>");
	}
	public void owed(Roulette roulette) {
		System.out.println("You owe to Casino " + Math.abs(roulette.getSum()) + "$");
	}
}
