package test26;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "이 사람의 이름은 " + name + "이며 나이는  " + age + "살이다";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
