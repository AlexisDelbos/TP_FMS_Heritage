package fr.fms.poo;

public class testCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		toulouse.displayCity();
		City tarbes = new City("Tarbes", "France", 50000);
		// tarbes.displayCity();
		toulouse.addPeople();
		
		// 1.2 
		toulouse.numberPeople = 370000;
		toulouse.displayCity();
		
		// 1.3 
		City rabat = new City("Rabat",577000);
		rabat.displayCity();
		rabat.setCountry("Maroc");
		rabat.displayCity();
		
		// 1.4
		toulouse.displayCity();
		
		// 1.5 - 1.6
		System.out.println(toulouse);
			// ça donne la valeur mémoire de toulouse
		
		// 1.7
		City.showNumberCity();
		
	}
	
}
