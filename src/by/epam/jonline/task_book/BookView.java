package by.epam.jonline.task_book;

import java.util.List;

public class BookView {
	public void printResult(Book book) {
		if (book != null)
			System.out.println(book);
		else
			System.out.println("В нашем списке таких книг нет!");
		
		System.out.println();
	}

	public void printWriters(List<Book> list) {
		for (Book b : list) {
			System.out.print(b.getWriter() + "|");
		}
		System.out.println("\r");
		System.out.println("Введите интересующего вас автора, полностью либо частично >>");
	}

	public void printPublishing(List<Book> list) {
		for (Book book : list) {
			System.out.print(book.getPublishing() + "|");
		}
		System.out.println("\r");
		System.out.println("Введите интересующее вас издательство, полностью либо частично >>");

	}

	public void thereIsNoP() {
		System.out.println("Вашего издательства нет в списках! - \"...видимо оно сгорело...\"");
	}

	public void printYear() {
		System.out.println("Введите год издания книги - книг позднее 1920г. в библиотеке нет. >>\r");
	}

}
