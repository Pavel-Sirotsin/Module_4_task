package by.epam.jonline.task_bill;

import java.util.List;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Bank {
	private String name;
	private List<Client> clientBase;

	public Bank() {
		super();
	}

	public Bank(String name) {
		super();
		this.name = name;
	}

	public Bank(String name, List<Client> clientBase) {
		super();
		this.name = name;
		this.clientBase = clientBase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClientBase() {
		return clientBase;
	}

	public void setClientBase(List<Client> clientBase) {
		this.clientBase = clientBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientBase == null) ? 0 : clientBase.hashCode());
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
		Bank other = (Bank) obj;
		if (clientBase == null) {
			if (other.clientBase != null)
				return false;
		} else if (!clientBase.equals(other.clientBase))
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
		StringBuilder sb = new StringBuilder("Bank: " + name);
		sb.append("\n");
		for (Client client : clientBase) {
			sb.append(client);
		}
		sb.append("\n");
		return sb.toString();
	}

}
