package by.epam.jonline.task_train;

import java.util.List;

public class Depo{
	private String name;
	private List<Train> schedule;

	public Depo() {
		super();
	}

	public Depo(String name) {
		super();
		this.name = name;
	}

	public Depo(String name, List<Train> schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Train> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Train> schedule) {
		this.schedule = schedule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
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
		Depo other = (Depo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Depo: %-5s | Schedule: %s", name, schedule);
	}

}
