package fr.fms.entities;

public class Capital extends City {
	
	private String monument;
	
	public Capital(String nameCity, String country, int numberPeople, String monument) {
		super(nameCity, country, numberPeople);
		this.monument = monument;
	}
	


	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	@Override
	public String toString() {
		return nameCity + ", " + country + ", " + numberPeople + " habitants, monument : " + monument;
	}
}
