package by.epam.jonline.task_travel;

import java.util.List;

public class TravelAgency {
	private String name;
	private List<Voucher> base;
	public final static String[] TYPE_OF_FEED = { "Код RO - Размещение без питания", "Код BB - Только завтраки",
			"Код HB - Завтрак и ужин", "Код AI - Все включено" };

	public TravelAgency() {
		super();
	}

	public TravelAgency(String name) {
		super();
		this.name = name;
	}

	public TravelAgency(String name, List<Voucher> base) {
		super();
		this.name = name;
		this.base = base;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Voucher> getBase() {
		return base;
	}

	public void setBase(List<Voucher> base) {
		this.base = base;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
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
		StringBuilder sb = new StringBuilder("Travel Agency: *** " + name + "***");
		sb.append("\n");
		for (Voucher type : base) {
			sb.append(type);
			sb.append("\n");
		}

		return sb.toString();
	}

	

}
