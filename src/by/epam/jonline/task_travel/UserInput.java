package by.epam.jonline.task_travel;

import java.util.Scanner;

public class UserInput {
	
	public String select() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNext("[1-5]{1}")) {

			System.out.println("Введите номер операции от 1 до 5");
			in.nextLine();

		}
		return in.next("[1-5]{1}");
	}

	public String type() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNext("[0-4]{1}")) {

			System.out.println("Введите код путёвки.");
			in.nextLine();

		}
		return in.next("[0-4]{1}");
	}

	public int digit() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextInt()) {
			System.out.println("Введите ценовой максимум.");
			in.nextLine();

		}
		return in.nextInt();
	}
	
	public String feed() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNext("[a-zA-Z]{2}")) {

			System.out.println("Введите код путёвки.");
			in.nextLine();

		}
		return in.next("[a-zA-Z]{2}");
	}


}
