package by.epam.jonline.task_counter;

import java.util.Scanner;

public class UserInput {

	public String makeBet(UserView view) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		while (!in.hasNext("[1-5]|stop")) {
			view.warning();
			in.nextLine();
		}
		if (in.hasNext("stop"))
			return "stop";
		else
			return in.nextLine();

	}

}
