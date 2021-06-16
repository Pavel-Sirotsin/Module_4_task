package by.epam.jonline.task_book;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

	public String genTitle(int i) {
		String[] mas = { "Рикша", "Ангелы и Демоны", "12 Стульев", "Три поросЁнка", "Братья деда-бородеда",
				"Поппи длинная панчоха", "007 Goldfinger", "Каратели", "Lena River", "Benny Hils and Co." };
		return mas[i];
	}

	public String genWriter(int i) {
		String[] mas = { "Твардовски Р.Л , Михальчик В.А.", "Гражина В.В.", "Абрамчик Ф.К.",
				"Критов С.Е. , Абрамчик Ф.К.", "Костюков Ф.Ч.", "Знатаков А.А.", "Fleming I.", "Корничев С.",
				"Hils J.M.", "Hils B.A." };
		return mas[i];
	}

	public String genPublishing(int i) {
		String[] mas = { "Лингва", "7 Hall", "Руштавой & Co", "Огненная Книга", "New View", "Золотая Библиотека",
				"Книжные Старатели", "New View", "Девятый Вал", "Лингва" };
		return mas[i];
	}

	public int genYear() {
		int randYear = 1920;
		randYear += (int) (Math.random() * 100);
		return randYear;
	}

	public int genPages() {
		return 100 + (int) (Math.random() * 1000);
	}

	public double generatePrice() {
		return 10 + Math.random() * 100;
	}

	public String generateBinding() {
		String randBinding;
		int temp = (int) (Math.random() * 15);
		if (temp < 5)
			randBinding = "Твердый";
		else if (temp > 5 && temp <= 10)
			randBinding = "Мягкий";
		else
			randBinding = "Иной";
		return randBinding;
	}

	public List<Book> createBookBase(int countOfBook) {
		List<Book> list = new ArrayList<>();
		for (int i = 0; i < countOfBook; i++) {
			list.add(new Book(i, genTitle(i), genWriter(i), genPublishing(i), genYear(), genPages(), generatePrice(),
					generateBinding()));
		}
		return list;
	}

}
