/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

// Предполагается использование данного класа в задаче №4 и №5

package by.epam.jonline.task_time;

public class Time implements Comparable<Time> {
	private int hour;
	private int minute;
	private int second;
	private String dayOfWeek;

	public static class Builder {
		private int hour;
		private int minute;
		private int second;
		private String dayOfWeek;
		private final String[] days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

		public Builder(int day) {
			if (day >= 0 && day < 7) {
				dayOfWeek = days[day];
			} else
				dayOfWeek = days[0];
		}

		public Builder hour(int val) {
			if (val >= 0) {
				val += hour;
				if (val >= 24) {
					hour = val % 24;
				} else {
					hour = val;
				}
			}
			return this;
		}

		public Builder minute(int val) {
			if (val >= 0) {
				val += minute;
				if (val >= 60) {
					minute = val % 60;
				} else {
					minute = val;
				}
			}
			return this;

		}

		public Builder second(int val) {
			if (val >= 0) {
				val += second;
				if (val >= 60) {
					second = val % 60;
				} else {
					second = val;
				}
			}
			return this;

		}

		public Time build() {
			return new Time(this);
		}

	}

	public Time() {
		super();
	}

	public Time(Builder builder) {
		hour = builder.hour;
		minute = builder.minute;
		second = builder.second;
		dayOfWeek = builder.dayOfWeek;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	@Override
	public int compareTo(Time o) {
		if (this.hour < o.hour)
			return -1;
		if (this.hour > o.hour)
			return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
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
		Time other = (Time) obj;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Time: %02d:%02d:%02d - %s", hour, minute, second, dayOfWeek);
	}

}
