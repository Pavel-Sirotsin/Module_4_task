package by.epam.jonline.task_customer;

import java.util.List;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Main {

	public static void main(String[] args) {
		DataGenerator data = new DataGenerator();
		int countOfCustomer = 10;

		Company company = new Company("AmWhat",data.generateBase(countOfCustomer));

		CustomerLogic logic = new CustomerLogic();

		logic.sortByInitials(company.getDataBase());
		System.out.println("**** Sorted by initials ****");
		for (Customer customer : company.getDataBase()) {
			System.out.println(customer);
		}

		List<Customer> cardRange = logic.sortByCard(company.getDataBase());
		System.out.println("\n**** Sorted by card ends on 800-1000 ****");
		if (cardRange == null) {
			System.out.println("There are no such cards.");
		} else {
			for (Customer customer : cardRange) {
				System.out.println(customer);
			}

		}
	}
}
