package by.epam.jonline.task_travel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VoucherLogic {

	public void sortByPrice(List<Voucher> base) {
		Collections.sort(base, new Comparator<Voucher>() {

			@Override
			public int compare(Voucher o1, Voucher o2) {
				if (o1.getPrice() < o2.getPrice())
					return -1;
				if (o1.getPrice() > o2.getPrice())
					return 1;
				return 0;
			}
		});
	}

	public void sortByDuration(List<Voucher> base) {
		Collections.sort(base, new Comparator<Voucher>() {

			@Override
			public int compare(Voucher o1, Voucher o2) {
				if (o1.getDuration() < o2.getDuration())
					return -1;
				if (o1.getDuration() > o2.getDuration())
					return 1;
				return 0;
			}
		});
	}

	public void sortByType(List<Voucher> base) {
		Collections.sort(base);
	}

	public List<Voucher> checkType(int key, List<Voucher> base) {
		List<Voucher> list = new ArrayList<Voucher>();
		for (Voucher voucher : base) {
			if (voucher.getType().ordinal() == key) {
				list.add(voucher);
			}
		}
		return list;
	}

	public Voucher checkTour(int max, int day, String feed, List<Voucher> list) {
		for (Voucher voucher : list) {
			if (voucher.getPrice() <= max && voucher.getDuration() >= day
					&& voucher.getFeeding().regionMatches(true, 4, feed, 0, 2) == true)
				return voucher;
		}
		return null;

	}

}
