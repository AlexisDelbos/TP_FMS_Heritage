package fr.fms.entities;

public class Employee extends People {
	
	private double salaryPeople;
	private String address;
	private String companyName;
	private City city;
	
	public static final double MIN_SALARY_PRICE = 1000;
	
	public Employee(String lastNamePeople, String surnamePeople, int oldPeople, String address, String companyName, double salaryPeople, City city) {
		super(lastNamePeople, surnamePeople, oldPeople);
		this.address = address;
		this.companyName = companyName;
		setSalaryPeople(salaryPeople);
		this.city = city;
	}

	public double getSalaryPeople() {
		return salaryPeople;
	}

	public void setSalaryPeople(double salaryPeople) {
		if(salaryPeople < MIN_SALARY_PRICE) {
			throw new RuntimeException("Le salaire minimum ne peut pas être négatif");
		}
		this.salaryPeople = salaryPeople;
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
	
    @Override
    public String toString() {
        return lastNamePeople + " " + surnamePeople + ", " + oldPeople + " ans, habitant à " + address + ", Ville de naissance : " + city.toString() + ", Entreprise : " + companyName + ", salaire : " + salaryPeople;
    }
}
