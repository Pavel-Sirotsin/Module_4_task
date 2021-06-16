package by.epam.jonline.task_book;

import java.util.Scanner;

public class UserInput {
	public String makeChoise() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		return in.nextLine();
	}

	public int сhooseYear() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNextInt()) {
			System.out.println("Доступные варианты представлены выше!\r");
			in.nextLine();

		}

		return in.nextInt();
	}
}
