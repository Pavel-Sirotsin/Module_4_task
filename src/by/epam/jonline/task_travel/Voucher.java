package by.epam.jonline.task_travel;

public class Voucher implements Comparable<Voucher> {

	private Type type;
	private double price;
	private int duration;
	private String feeding;
	private String transport;

	public Voucher() {
		super();
	}

	public Voucher(Type type, double price, int duration, String feeding, String transport) {
		super();
		this.type = type;
		this.price = price;
		this.duration = duration;
		this.feeding = feeding;
		this.transport = transport;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFeeding() {
		return feeding;
	}

	public void setFeeding(String feeding) {
		this.feeding = feeding;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((feeding == null) ? 0 : feeding.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Voucher other = (Voucher) obj;
		if (duration != other.duration)
			return false;
		if (feeding == null) {
			if (other.feeding != null)
				return false;
		} else if (!feeding.equals(other.feeding))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public int compareTo(Voucher o) {
		return type.compareTo(o.type);
	}

	@Override
	public String toString() {
		return String.format("Voucher - %-10s | Цена %-7.2f BYN | Длительность: %-2d | Питание: %-33s | Транспорт: %s",
				type, price, duration, feeding, transport);
	}

}
