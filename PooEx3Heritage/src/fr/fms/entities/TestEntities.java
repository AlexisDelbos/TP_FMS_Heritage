package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class TestEntities {
    public static void main(String[] args) {

    	City washington = new City("Washington", "USA", 700000);
        City paloAlto = new City("Palo Alto", "USA", 67024);
        City toulouse = new City("Toulouse", "France", 471941);
        City limoges = new City("Limoges", "France", 133627);


        Employee emp1 = new Employee("Gate", "Bill", 65, "USA", "Fondation B&M", 100000, washington);
        Employee emp2 = new Employee("Musk", "Elon", 49, "Palo Alto", "Tesla", 150000, paloAlto);
        Trade trade1 = new Trade("Dupont", "Robert", 50, "rue des rosiers à Toulouse", "Brico", toulouse, 0.05);

        Object[] employeesArray = {emp1, emp2, trade1};

        System.out.println("Affichage des informations à partir du tableau :");
        for (Object obj : employeesArray) {
            System.out.println(obj.toString());
        }

        List<Object> employeesList = new ArrayList<>();
        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(trade1);

        System.out.println("\nAffichage des informations à partir de la liste :");
        for (Object obj : employeesList) {
            System.out.println(obj.toString());
        }
    }
}
