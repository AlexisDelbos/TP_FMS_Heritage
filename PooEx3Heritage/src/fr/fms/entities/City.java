package fr.fms.entities;

public class City {
	
	public String nameCity;
	public String country;
	public int numberPeople;
	
	public City(String nameCity, String country, int numberPeople) {
		this.nameCity = nameCity;
		this.country = country;
		this.numberPeople = numberPeople;
	}

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
		this.numberPeople = numberPeople;
	}

	@Override
	public String toString() {
		return nameCity + ", " + country + ", " + numberPeople + " habitants";
	}
}
