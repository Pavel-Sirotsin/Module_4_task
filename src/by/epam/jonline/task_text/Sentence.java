package by.epam.jonline.task_text;

import java.util.List;

public class Sentence {
	private List<Word> words;

	public Sentence() {
		super();
	}

	public Sentence(List<Word> words) {
		super();
		this.words = words;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
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
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Sentence:\n");
		for (Word word : words) {
			sb.append(word);
		}
		return sb.toString();
	}

}
