package test02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫숫자 입력 : ");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.print("둘째숫자 입력: ");
		int num2 = Integer.parseInt(scan.nextLine());
		System.out.print("연산자 입력: ");
		String oo = scan.nextLine();
		System.out.println(num1 + " "  + oo + " " + num2);
		if (oo.equals("+")) {
			System.out.println(num1 + num2);
		} else if (oo.equals("-")) {
			System.out.println(num1 - num2);
		} else if (oo.equals("*")) {
			System.out.println(num1 * num2);
		} else if (oo.equals("/")) {
			System.out.println(num1 / num2);
		} else if (oo.equals("%")) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("똑바로 입력 안 해?");

		}
	}
}
