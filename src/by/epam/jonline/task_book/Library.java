package by.epam.jonline.task_book;

import java.util.List;

public class Library {
	private String name;
	private int members;
	private List<Book> dataBase;

	public Library() {
		super();
	}

	public Library(String name, int members, List<Book> dataBase) {
		super();
		this.name = name;
		this.members = members;
		this.dataBase = dataBase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public List<Book> getDataBase() {
		return dataBase;
	}

	public void setDataBase(List<Book> dataBase) {
		this.dataBase = dataBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataBase == null) ? 0 : dataBase.hashCode());
		result = prime * result + members;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Library other = (Library) obj;
		if (dataBase == null) {
			if (other.dataBase != null)
				return false;
		} else if (!dataBase.equals(other.dataBase))
			return false;
		if (members != other.members)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Library - ");
		sb.append("Название: " + name);
		sb.append(" | Количество членов: " + members);
		sb.append(" | Список книг:\n");
		for (Book book : dataBase) {
			sb.append(book + "\n");
		}
		return sb.toString();
	}

}
