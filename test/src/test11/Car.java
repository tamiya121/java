package test11;

public class Car {

	private int speed;
	private String name;
	private String company;
	
	public void s(int speed ) {
		this.speed = speed;
	}
	public void n(String name) {
		this.name =name;
	}
	public void c(String company) {
		this.company = company;
	}
	
	public void kkk() {
		System.out.println("이 자동차의 속도는 max " + speed + "KM");
		System.out.println("이 자동차의 이름은 " + name);
		System.out.println("이 자동차의 브랜드는 " + company);
		
	}
}
