package practice;

public class Person {
	
	String name;
	int age;
	int height;
	String nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Person(String name, int age, int height, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.nationality = nationality;
	}
	
	

}
