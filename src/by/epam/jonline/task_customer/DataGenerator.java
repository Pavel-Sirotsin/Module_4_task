package by.epam.jonline.task_customer;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
	private String genInitials(int i) {
		String[] mas = { "Beck C.", "Mayer A.", "Phillips A.", "Reilly C.", "Chapman N.", "Burke L.", "Rivera G.",
				"Stark L.", "Hall B.", "Blackburn D." };
		return mas[i];
	}

	private String genAdress(int i) {
		String[] mas = { "80 Sulphur Springs St.,Palatine", "7 Hall Close, Fleggburgh",
				"Flat 2, 16 Fairfield Road, Beckenham", "4 Oakley Road, Warlingham", "1 Carlton View, Leeds",
				"700 Kingswood Road, Nuneaton", "328 Bournemouth Road, Charlton Marshall",
				"1 Southview Villas, Takeley", "Irish Farm, St Breward", "20 Kingswood Road, Prestwich" };
		return mas[i];
	}

	private long genCardN() {
		long randCardN = 5403_0000_0000_0000L;
		randCardN += (long) (Math.random() * 1000_0000_0000L);
		return randCardN;
	}

	public List<Customer> generateBase(int countOfCustomer) {
		List<Customer> list = new ArrayList<>();

		for (int i = 0; i < countOfCustomer; i++) {
			list.add(new Customer(i, genInitials(i), genAdress(i), genCardN()));
		}

		return list;
	}

}
