package de.telekom.sea7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person_herbert = new Person("Herbert","Müller","m",3,6,1984); 
		Person person_Jutta = new Person("Jutta","Bauer","w",17,3,1970);
		Person person_herbert2 = new Person("Herbert","Müller","m",3,6,1984); 
		
		Punkt punkt1 = new Punkt(30,28);
		Punkt punkt2 = new Punkt(5,70);
		Punkt punkt12 = new Punkt(30,28);
		
		System.out.println(person_herbert.equals(person_Jutta));
		System.out.println(person_herbert.equals(person_herbert2));
		System.out.println(person_herbert.toString());
		System.out.println(person_Jutta.toString());
		
		System.out.println(punkt1.equals(punkt2));
		System.out.println(punkt1.equals(punkt12));
		System.out.println(punkt1.toString());
		System.out.println(punkt2.toString());
	}

}
