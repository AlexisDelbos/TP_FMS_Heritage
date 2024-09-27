package fr.fms.poo;

public class Person {

    public String lastName;
    public String firstName;
    public int old;
    public String adress;
    public City nameCity;
    public City country;


    public Person(String lastName, String firstName, int old, String adress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.old = old;
        this.adress = adress;
    }

    public Person(String lastName, String firstName, int old) {
        this(lastName, firstName, old, "unknown");
    }

    public Person(String lastName, String firstName) {
        this(lastName, firstName, 0, "unknown");
    }

    public Person(String lastName, String firstName, int old, String adress, City nameCity) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.old = old;
        this.adress = adress;
        this.nameCity = nameCity;
    }

    public String getPersonBornInFrench() {
        if (this.adress.contains("Paris") || (this.nameCity != null && (this.nameCity.getNameCity().equals("Paris") || this.nameCity.getCountry().equals("France")))) {
            return this.toString();
        }
        return null;
    }

    
    @Override
    public String toString() {
        return "Person [lastName=" + this.lastName + ", firstName=" + this.firstName + ", age=" + this.old + ", adress=" + this.adress +
               "] BornCity" + "[name=" + this.nameCity + "]";
    }
}
