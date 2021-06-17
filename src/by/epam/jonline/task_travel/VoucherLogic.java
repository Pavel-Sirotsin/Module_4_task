package by.epam.jonline.task_travel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class VoucherLogic {

	public void sortByPrice(List<Voucher> base) {
		Collections.sort(base, new Comparator<Voucher>() {

			@Override
			public int compare(Voucher o1, Voucher o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
	}

	public void sortByDuration(List<Voucher> base) {
		Collections.sort(base, new Comparator<Voucher>() {

			@Override
			public int compare(Voucher o1, Voucher o2) {
				return Integer.compare(o1.getDuration(), o2.getDuration());
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

	public List<Voucher> checkTour(int max, int day, String feed, List<Voucher> list) {
		Iterator<Voucher> it = list.iterator();

		while (it.hasNext()) {
			Voucher current = it.next();
			if (current.getPrice() > max)
				it.remove();
			else if (current.getDuration() < day)
				it.remove();
			else if (current.getFeeding().regionMatches(true, 4, feed, 0, 2) == false)
				it.remove();

		}
		return list;

	}

}
