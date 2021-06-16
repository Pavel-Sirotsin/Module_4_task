package by.epam.jonline.task_state;

import java.util.List;

public class Region {
	private String name;
	private String regionalCenter;
	private List<District> districts;

	public Region() {
		super();
	}

	public Region(String name, String regionalCenter, List<District> district) {
		super();
		this.name = name;
		this.regionalCenter = regionalCenter;
		this.districts = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regionalCenter == null) ? 0 : regionalCenter.hashCode());
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionalCenter == null) {
			if (other.regionalCenter != null)
				return false;
		} else if (!regionalCenter.equals(other.regionalCenter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Region: " + name);
		sb.append(" | Региональный центр: " + regionalCenter + " \n");
		for (District d : districts) {
			sb.append(d);
		}
		return sb.toString();

	}
}
