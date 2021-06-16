package by.epam.jonline.task_travel;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

public class Main {

	public static void main(String[] args) {
		TravelAgency agency = new TravelAgency("TezTour");
		DataGenerator data = new DataGenerator(agency);
		UserLogic logic = new UserLogic(agency);
		
		data.createVoucherBase(10);
		
		logic.chooseOperation();

	}

}
