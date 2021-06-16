package by.epam.jonline.task_customer;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Customer implements Comparable<Customer>{

	private int id;
	private String initials;
	private String adress;
	private long cardN;

	public Customer() {
		super();
	}

	public Customer(int id, String initials, String adress, long cardN) {
		super();
		this.id = id;
		this.initials = initials;
		this.adress = adress;
		this.cardN = cardN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardN() {
		return cardN;
	}

	public void setCardN(long cardN) {
		this.cardN = cardN;
	}

	@Override
	public int compareTo(Customer o) {
		return this.initials.compareTo(o.initials);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + (int) (cardN ^ (cardN >>> 32));
		result = prime * result + id;
		result = prime * result + ((initials == null) ? 0 : initials.hashCode());
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
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (cardN != other.cardN)
			return false;
		if (id != other.id)
			return false;
		if (initials == null) {
			if (other.initials != null)
				return false;
		} else if (!initials.equals(other.initials))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Id: %-2d Initials: %-12s Adress: %-40s Card number: %-17d", id,
				initials, adress, cardN);
	}

}
