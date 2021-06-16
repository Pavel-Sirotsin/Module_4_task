package by.epam.jonline.task_travel;

import java.util.List;

public class UserView {

	public void printInfo() {
		System.out.println("Введите номер операции: \r\n" + "1) отсартировать путевки по цене - по возрастанию.\r\n"
				+ "2) отсартировать путевки по длительности - по возрастанию.\r\n"
				+ "3) отсартировать путевки по типу.\r\n" + "4) найти путевку по заданным критериям.\r\n"
				+ "5) \"Выход\"  \r");
	}

	public void printBase(TravelAgency agency) {
		System.out.println(agency);
	}

	public void printVoucher(Voucher voucher) {
		if (voucher == null)
			System.out.println("Не существует!");
		else
			System.out.println(voucher);

	}

	public void printType(List<Voucher> base) {
		System.out.println("Выберите код интересующей Вас путевки >>");
		for (Type type : Type.values()) {
			System.out.println(type);
		}
	}

	public void printPrice() {
		System.out.println("Введите ценовой максимум путёвки >>");
	}

	public void printDuration() {
		System.out.println("Введите минимальное количество дней пребывания >>");
	}

	public void printFeeding() {
		System.out.println("Введите код типа питания >>");
		for (String f : TravelAgency.TYPE_OF_FEED) {
			System.out.printf("%s | ", f);
		}
		System.out.println();
	}
}
