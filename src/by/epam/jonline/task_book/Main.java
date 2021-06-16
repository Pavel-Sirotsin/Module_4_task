package by.epam.jonline.task_book;

public class Main {

	public static void main(String[] args) {
		DataGenerator data = new DataGenerator();
		int countOfBook = 10;

		Library library = new Library("Пушкина", 100, data.createBookBase(countOfBook));

		BookView view = new BookView();
		UserInput input = new UserInput();
		BookLogic logic = new BookLogic();
		
		view.printWriters(library.getDataBase());
		String writer = input.makeChoise();
		
		Book bookW = logic.sortByWriter(library.getDataBase(), writer);
		view.printResult(bookW);
		
		view.printPublishing(library.getDataBase());
		String publishing = input.makeChoise();
		
		Book bookP = logic.sortByPublishing(library.getDataBase(), publishing);
		view.printResult(bookP);
		
		view.printYear();
		int year = input.сhooseYear();
		
		Book bookY = logic.sortByYear(library.getDataBase(), year);
		view.printResult(bookY);

	}
}
