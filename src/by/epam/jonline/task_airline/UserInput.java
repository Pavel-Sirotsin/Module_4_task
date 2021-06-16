package by.epam.jonline.task_airline;

import java.util.Scanner;

public class UserInput {

	public String select() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNext("[1-4]{1}")) {
			System.out.println("Enter 1, 2, 3 or 4");
			in.nextLine();

		}

		return in.next("[1-4]{1}");
	}

	public String makeChoice() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			System.out.println("See variants above.");
			in.nextLine();

		}

		return in.nextLine();
	}

	public int time() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNext("[0-9]{2}")) {
			System.out.println("Permitted format \"HH\"");
			in.nextLine();

		}

		return Integer.parseInt(in.nextLine());
	}

}
