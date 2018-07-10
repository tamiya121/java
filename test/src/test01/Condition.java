package test01;

public class Condition {
	public static void main(String[] agrs) {
		if (1 != 1) {
			System.out.println("1과 1은 당연히 같지 ㅋㅋㅋ");
		} else {
			System.out.println("1과 1이 다른 게 말이 되냐?ㅋㅋㅋ");
		}
		int age = 23;
		if (age >= 40) {
			System.out.println("40대구나");
		}else if (age >=30) {
			System.out.println("30대"); 
		}else if (age >= 20) {
			System.out.println("20대");

		} else if (age >= 20) {
			System.out.println("10대");
		} else {
			System.out.println("할배");
		}
	}

}
