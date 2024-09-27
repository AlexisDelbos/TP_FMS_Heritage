package fr.fms.entities;

public class Trade extends People {
	
	private double commissionRate;
	private String address;
	private String companyName;
	private City city;
	
	public Trade(String lastNamePeople, String surnamePeople, int oldPeople, String address, String companyName, City city, double commissionRate) {
		super(lastNamePeople, surnamePeople, oldPeople);
		this.address = address;
		this.companyName = companyName;
		this.city = city;
		setCommissionRate(commissionRate);
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate < 0) {
			throw new RuntimeException("ça ne peut pas être négatif.");
		}
		this.commissionRate = commissionRate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public double numberCA(double sales) {
		return sales * commissionRate;
	}

	@Override
	public String toString() {
		return lastNamePeople + " " + surnamePeople + ", " + oldPeople + " ans, habitant à " + address + ", Ville de naissance : " + city.toString() + ", Entreprise : " + companyName + ", % CA : " + (commissionRate * 100) + "%";
	}
}
