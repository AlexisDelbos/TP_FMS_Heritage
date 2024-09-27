package fr.fms.entities;

public class People {
	
	public String lastNamePeople;
	public String surnamePeople;
	public int oldPeople;
	private City city;
	
	
	public People(String lastNamePeople, String surnamePeople, int oldPeople){
		this.lastNamePeople = lastNamePeople;
		this.surnamePeople = surnamePeople;
		this.oldPeople = oldPeople;		
	}
	
	public People(String lastNamePeople, String surnamePeople, int oldPeople, City city){
		this.lastNamePeople = lastNamePeople;
		this.surnamePeople = surnamePeople;
		this.oldPeople = oldPeople;	
		this.city = city;
}

	public String getLastNamePeople() {
		return lastNamePeople;
	}

	public void setLastNamePeople(String lastNamePeople) {
		this.lastNamePeople = lastNamePeople;
	}

	public String getSurnamePeople() {
		return surnamePeople;
	}

	public void setSurnamePeople(String surnamePeople) {
		this.surnamePeople = surnamePeople;
	}

	public int getOldPeople() {
		return oldPeople;
	}

	public void setOldPeople(int oldPeople) {
		this.oldPeople = oldPeople;
	}
	
    @Override
    public String toString() {
        return lastNamePeople + " " + surnamePeople + ", " + oldPeople + " ans, " + " Ville de naissance " + (city != null ? city.toString() : "Pas de ville");
    }
}
