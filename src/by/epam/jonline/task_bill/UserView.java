package by.epam.jonline.task_bill;

import java.util.List;

public class UserView {

	public void printIfo() {
		System.out.println("Введите номер операции: \r\n" + "1) найти счет в базе по последним цифрам номера.\r\n"
				+ "2) блокировка счета.\r\n" + "3) отсартировать счетa клиентов по балансу - по возрастанию.\r\n"
				+ "4) вывести общую сумму по счетам в BYN (код 933).\r\n"
				+ "5) вывести общую сумму по счетам с отрицательным балансом в BYN (код 933).\r\n"
				+ "6) вывести общую сумму по счетам с положительным балансом в BYN (код 933).\r\n"
				+ "7) \"Выход\"  \r");
	}

	public void printCase_1() {
		System.out.println("Введите последние цифры счета в кол-ве от 1-ой до 3-ёх >>");
	}

	public void printCase_2(List<Client> base) {
		for (Client c : base) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println("Введите последних 4-е цифры счета для блокировки >>");

	}

	public void printCase_7() {
		System.out.println("Спасибо, что были с нами...");
	}

	public void printBill(List<Bill> b) {
		if (b.size() > 0) {
			for (Bill bill : b) {
				System.out.println(bill);
			}
		} else {
			System.out.println("Такого счета не существуют!");
		}

	}

	public void printAmount(Client client, double amount) {
		System.out.printf("Id: %d | %15s | Общая сумма: %.2f BYN\n", client.getId(), client.getInitials(), amount);

	}

	public void printNegative(Client client, double amount) {
		if (amount < 0) {
			System.out.printf("Id: %d | %15s | Общая сумма: %.2f BYN\n", client.getId(), client.getInitials(), amount);
		}

	}

	public void printPositive(Client client, double amount) {
		if (amount > 0) {
			System.out.printf("Id: %d | %15s | Общая сумма: %.2f BYN\n", client.getId(), client.getInitials(), amount);
		}

	}

}
