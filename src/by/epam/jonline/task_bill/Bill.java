package by.epam.jonline.task_bill;

public class Bill implements Comparable<Bill> {

	private Currency сurrency;
	private String number;
	private double sum;
	private boolean blocked;

	public Bill() {
		super();
	}

	public Bill(Currency сurrency, String number, double sum, boolean blocked) {
		super();
		this.сurrency = сurrency;
		this.number = number;
		this.sum = sum;
		this.blocked = blocked;
	}

	public Currency getСurrency() {
		return сurrency;
	}

	public void setСurrency(Currency сurrency) {
		this.сurrency = сurrency;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((сurrency == null) ? 0 : сurrency.hashCode());
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
		Bill other = (Bill) obj;
		if (blocked != other.blocked)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (Double.doubleToLongBits(sum) != Double.doubleToLongBits(other.sum))
			return false;
		if (сurrency != other.сurrency)
			return false;
		return true;
	}

	@Override
	public int compareTo(Bill o) {
		if (this.sum < o.getSum())
			return -1;
		if (this.sum > o.getSum())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Bill | %s | Номер счета: %s | Баланс: %8.2f | Блокировка счёта: %b ", сurrency, number,
				sum, blocked);
	}

}
