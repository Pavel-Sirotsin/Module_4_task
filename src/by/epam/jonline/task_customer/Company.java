package by.epam.jonline.task_customer;

import java.util.List;

public class Company {
	private List<Customer> dataBase;
	private String name;

	public Company() {
		super();
	}
	
	public Company(String name) {
		super();
		this.name = name;
	}

	public Company(String name, List<Customer> dataBase) {
		super();
		this.dataBase = dataBase;
		this.name = name;
	}

	public List<Customer> getDataBase() {
		return dataBase;
	}

	public void setDataBase(List<Customer> dataBase) {
		this.dataBase = dataBase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataBase == null) ? 0 : dataBase.hashCode());
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
		Company other = (Company) obj;
		if (dataBase == null) {
			if (other.dataBase != null)
				return false;
		} else if (!dataBase.equals(other.dataBase))
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
		StringBuilder sb = new StringBuilder("Company - Name: " + name);
		for (Customer customer : dataBase) {
			sb.append(customer);
		}
		return sb.toString();
	}

}
