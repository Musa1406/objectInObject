package objectInObject;

public class Person {
	private String name;
	private String surname;
	private int age;
	private Company company;
	private Title title;
	public Person() {
		super();
	}
	public Person(String name, String surname, int age, Company company, Title title) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.company = company;
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}

}
