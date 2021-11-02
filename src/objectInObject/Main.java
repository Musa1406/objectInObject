package objectInObject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> persons= new ArrayList<Person>();
		ArrayList<Title> titles= new ArrayList<Title>();
		ArrayList<Company> companys=new ArrayList<Company>();
		persons.add(new Person ("Ahmet","Kara",31));
		persons.add(new Person("Murat","K�ym�k",25));
		persons.add(new Person("Ensar","Karman",23));
		persons.add(new Person("Lale","Su",25));
		titles.add(new Title("Metin 2",10));
		titles.add(new Title("Zula",50));
		titles.add(new Title("Pubg Mobile",31));
		companys.add(new Company("Microsoft","www.microsoft.com"));
		companys.add(new Company("Youtube","www.youtube.com"));
		companys.add(new Company("�nstagram","www.instagram.com"));
		System.out.println(persons.get(0).getName());
		System.out.println(persons.get(1).getName());
	
       for(Person person:persons) {
    	   System.out.println(person.getName()+"Ad� "+person.getSurname()+"SoyAd�"+person.getAge());
   }
}
}