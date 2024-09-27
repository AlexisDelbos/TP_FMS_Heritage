package fr.fms.poo;

public class City {

	private String nameCity;
	private String country;
	public  int numberPeople;

	
	private static int counterClassCity = 0;
	
	public City(String nameCity, String country, int numberPeople) {
		setNameCity(nameCity);
		setCountry(country);
		setNumberPeople(numberPeople);
		counterClassCity++;
	}	
	
	public City(String nameCity, int numberPeople) {
		setNameCity(nameCity);
		setCountry("Unknown");
		setNumberPeople(numberPeople);
		counterClassCity++;

	}
	
	public City(String nameCity, String country) {
		setNameCity(nameCity);
		setCountry(country);
	}
	

	public void displayCity() {
		System.out.println("ville de " + this.nameCity + " en " + this.country + " ayant : " + this.numberPeople + " habitants " );
	}
	
	public void addPeople() {
		numberPeople  = numberPeople + 20000 ;
		displayCity();
	}
	
	public static void showNumberCity() {
		System.out.println("Il y a " + counterClassCity + " ville");
	}
	
	
	// Getters & Setters 
	
	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumberPeople() {
		return numberPeople;
	}

	public void setNumberPeople(int numberPeople) {
		if(numberPeople < 0) {
			throw new RuntimeException("Le nombre d'habitant ne peut pas être négatif");
		}
		this.numberPeople = numberPeople;
	}
	
	public String toString() {
		String resultNumberPeople = (numberPeople > 0) ? " ayant " + numberPeople + "habitants " : "";
		return "Ville de " + getNameCity() + " en : " + getCountry() + " ayant " + resultNumberPeople + " habitants";
	}

	
	
}
