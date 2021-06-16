/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.*/
package by.epam.jonline.task_state;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<City> BeshenkowichiCity = new ArrayList<City>();
		BeshenkowichiCity.add(new City("Бешенковичи"));
		BeshenkowichiCity.add(new City("Соржа"));
		BeshenkowichiCity.add(new City("Верхово"));
		BeshenkowichiCity.add(new City("Островенск"));
		BeshenkowichiCity.add(new City("Уллье"));

		List<City> BraslavCity = new ArrayList<City>();
		BraslavCity.add(new City("Браслав"));
		BraslavCity.add(new City("Илма"));
		BraslavCity.add(new City("Двинск"));
		BraslavCity.add(new City("Громово"));

		List<District> VitebskDistrict = new ArrayList<District>();
		VitebskDistrict.add(new District("Бешенковичский район", BeshenkowichiCity));
		VitebskDistrict.add(new District("Браславский район", BraslavCity));

		List<Region> BelarusRegion = new ArrayList<Region>();
		BelarusRegion.add(new Region("Витебская область", "Витебск", VitebskDistrict));

		Polity Belarus = new Polity(207.600, "Минск", BelarusRegion);
		
		PolityLogic logic = new PolityLogic();

		System.out.println(logic.printTheCapital(Belarus));
		
		System.out.println(logic.printAmountOfRegions(Belarus));
		
		System.out.println(logic.printSquare(Belarus));
		
		for (String s : logic.printRegionCenter(Belarus)) {
			System.out.println(s);
		}
		

	}

}
