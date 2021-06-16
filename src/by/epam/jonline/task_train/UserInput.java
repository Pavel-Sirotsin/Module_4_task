package by.epam.jonline.task_train;

import java.util.Scanner;

public class UserInput {

	public int trainNumber() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNextInt()) {
			System.out.println("Доступные номера поездов представлены выше!\n");
			in.nextLine();

		}

		return in.nextInt();
	}

}
