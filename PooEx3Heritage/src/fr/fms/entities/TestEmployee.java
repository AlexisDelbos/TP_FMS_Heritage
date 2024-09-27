package fr.fms.entities;

public class TestEmployee {

	public static void main(String[] args) {

		Capital washington = new Capital("Washington", "USA", 7600000, "W-M");
		Employee emp = new Employee("Gate", "Bill", 65, "habitant aux USA", "Fondation B&M", 100000.0, washington);
		System.out.println(emp);

		City pretoria = new City("Pretoria", "Afrique du Sud", 800000);
		Employee elonMusk = new Employee("Musk", "Elon", 49, "Palo Alto", "Tesla", 150000.0, pretoria);
		System.out.println(elonMusk);
		
		City limoges = new City("Limoges", "France", 133000);
		Trade robertDupont = new Trade("Dupont", "Robert", 50, "rue des rosiers à Toulouse", "brico", limoges, 0.05);
		System.out.println(robertDupont);

		





	}

}
