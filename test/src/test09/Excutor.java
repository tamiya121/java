package test09;

public class Excutor {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("김주대");
		p.setAge(32);
		p.setAddress("우리집");
		String nameOfP = p.getName();
		System.out.println(nameOfP);
		
		
	}
}