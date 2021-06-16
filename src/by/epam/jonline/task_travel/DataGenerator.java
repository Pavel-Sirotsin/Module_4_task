package by.epam.jonline.task_travel;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
	private TravelAgency agency;

	public DataGenerator() {
		super();
	}

	public DataGenerator(TravelAgency agency) {
		super();
		this.agency = agency;
	}

	private double genPrice() {
		return 500 + Math.random() * 3000;
	}

	private int genDuration() {
		int[] mas = { 5, 7, 10, 14 };
		int rand = (int) (Math.random() * mas.length);

		return mas[rand];
	}

	private String genFeeding() {
		int rand = (int) (Math.random() * TravelAgency.TYPE_OF_FEED.length);

		return TravelAgency.TYPE_OF_FEED[rand];
	}

	private String genTransport() {
		String[] mas = { "Автобус", "Самолет", "Поезд" };
		int rand = (int) (Math.random() * mas.length);

		return mas[rand];
	}

	public void createVoucherBase(int countOfOffer) {
		List<Voucher> base = new ArrayList<>();
		Type[] type = Type.values();

		for (int i = 0; i < countOfOffer; i++) {
			int rand = (int) (Math.random() * type.length);

			base.add(new Voucher(type[rand], genPrice(), genDuration(), genFeeding(), genTransport()));
		}
		agency.setBase(base);
	}

}
