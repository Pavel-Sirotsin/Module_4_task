package by.epam.jonline.task_text;

import java.util.ArrayList;
import java.util.List;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/

public class Main {

	public static void print(Text text) {
		System.out.println(text.getTitle());
		for (Sentence sentence : text.getSentences()) {
			for (Word word : sentence.getWords()) {
				System.out.print(word + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		List<Word> words = new ArrayList<Word>();
		words.add(new Word("Great"));
		words.add(new Word("big"));
		words.add(new Word("mistake"));
		words.add(new Word("you"));
		words.add(new Word("have"));
		words.add(new Word("made!"));

		List<Sentence> sentences = new ArrayList<Sentence>();
		sentences.add(new Sentence(words));

		Text text = new Text("Jurrasik Park", sentences);
		print(text);

		text.addText("Years of people's evolution! Dinosaurs - terrible decision!");
		print(text);

	}

}
