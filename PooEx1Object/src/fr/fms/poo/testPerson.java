package fr.fms.poo;

public class testPerson {
	
	public static void main(String[] args) {
	    Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));		
	    Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");
		
//		System.out.println(manu);
//		System.out.println(poutine);
//		System.out.println(biden);

		// 2.0
		
		Person nicolas = new Person("Sarkozy", "Nicolas", 66,"Paris", new City("Paris","France"));
		Person johnson = new Person("Johnson", "Boris", 56,"Downing Street à London", new City("New York","USA"));
		Person depardieu = new Person("Depardieu", "Gérard", 72,"Moscou", new City("Chateauroux","France"));
		Person kravitz = new Person("Kravitz", "Lenny", 56,"Hotel Particulier à Paris", new City("New York","USA"));
		Person lawrence = new Person("Lawrence", "Jennifer", 30,"Louisville aux USA", new City("Indian Hills","USA"));
		 
		Person[] persons = {manu,nicolas, johnson, depardieu, kravitz, lawrence};
		  
		  
		for(Person person : persons) {
			String result = person.getPersonBornInFrench();
			if(result != null) {
				System.out.println(result);
			}
		}


	}
}
