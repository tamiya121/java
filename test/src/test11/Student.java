package test11;
//모든 변수는 반드시 1개의 함수만 사용해서 한 번에 1개의 값만 입력받을 수 있다.
//해당 클래스의 class, name, grade를 출력하는 함수는 1개로 해도 된다.
public class Student {

	private String clazz;
	private String name;
	private int grade;
	
	public void m(String clazz, String name, int grade) {
		this.clazz=clazz;
		this.name=name;
		this.grade=grade;
	}
	
	public void aaa() {
		System.out.println("클라스" + clazz);
		System.out.println("이름" + name);
		System.out.println("등급" + grade);
	}
}
