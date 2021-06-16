package by.epam.jonline.task_bill;

import java.util.Scanner;

public class UserInput {

	public String select() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNext("[1-7]")) {

			System.out.println("Выберите операцию от 1 до 7");
			in.nextLine();

		}
		return in.next("[1-7]{1}");
	}

	public String initials() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextInt()) {
			System.out.println("Введите ФИО клиента - частично либо полностью");
			in.nextLine();

		}
		return in.nextLine();
	}

	public String lastBillDigit() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNext("[0-9]{1,4}")) {
			System.out.println("Введите последние цифры счета от 1-ой до 4-ёх.");
			in.nextLine();

		}
		return in.nextLine();
	}

}
