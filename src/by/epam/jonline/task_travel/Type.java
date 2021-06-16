package by.epam.jonline.task_travel;

public enum Type {
	ОТДЫХ, ЭКСКУРСИЯ, ЛЕЧЕНИЕ, ШОПИНГ, КРУИЗ;

	@Override
	public String toString() {
		return String.format("Type - Код: %d %-10s", ordinal(), name());
	}
}
