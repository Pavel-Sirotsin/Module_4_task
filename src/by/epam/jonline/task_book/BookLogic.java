package by.epam.jonline.task_book;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookLogic {

	public Book sortByWriter(List<Book> list, String regex) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

		for (Book book : list) {
			String writer = book.getWriter();
			Matcher matcher = pattern.matcher(writer);

			if (matcher.find()) {
				return book;
			}
		}

		return null;
	}

	public Book sortByPublishing(List<Book> mas, String regex) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

		for (Book book : mas) {
			String reg = book.getPublishing();
			Matcher matcher = pattern.matcher(reg);

			if (matcher.find()) {
				return book;
			}
		}
		return null;
	}

	public Book sortByYear(List<Book> list, int year) {

		for (Book book : list) {
			if (book.getYear() >= year) {
				return book;
			}
		}
		return null;
	}

}
