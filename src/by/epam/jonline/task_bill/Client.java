package by.epam.jonline.task_bill;

import java.util.List;

public class Client {

	private int id;
	private String initials;
	private List<Bill> billData;

	public Client() {
		super();
	}

	public Client(int id, String initials, List<Bill> billData) {
		super();
		this.id = id;
		this.initials = initials;
		this.billData = billData;
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

	public List<Bill> getBillData() {
		return billData;
	}

	public void setBillData(List<Bill> billData) {
		this.billData = billData;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billData == null) ? 0 : billData.hashCode());
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
		Client other = (Client) obj;
		if (billData == null) {
			if (other.billData != null)
				return false;
		} else if (!billData.equals(other.billData))
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
		StringBuilder sb = new StringBuilder("Client: " + id);
		sb.append(" | ФИО: " + initials);
		sb.append("\n");
		for (Bill bill : billData) {
			sb.append(bill);
			sb.append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}

}
