package by.epam.jonline.task_customer;

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

}
