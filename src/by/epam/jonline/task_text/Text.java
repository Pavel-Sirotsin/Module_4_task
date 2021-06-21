package by.epam.jonline.task_text;

import java.util.ArrayList;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/

import java.util.List;

public class Text {
	private String title;
	private List<Sentence> sentences;

	public Text() {
		super();
	}

	public Text(String title) {
		super();
		this.title = title;
	}

	public Text(String title, List<Sentence> sentences) {
		super();
		this.title = title;
		this.sentences = sentences;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public void addText(String text) {
		String[] words = text.split(" ");
		List<Word> extra = new ArrayList<Word>();
		for (int i = 0; i < words.length; i++) {
			extra.add(new Word(words[i]));
		}
		sentences.add(new Sentence(extra));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Text - Title: " + title + "\n");
		for (Sentence sentence : sentences) {
			sb.append(sentence);
		}
		return sb.toString();
	}

}
