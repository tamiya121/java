package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Person> pList = new ArrayList<Person>();
		
		for (int i = 0; i < 2; i++) {
		System.out.println("이름을 입력하삼");
		String name = s.nextLine();
		System.out.println("나이를 입력하삼");
		int age = Integer.parseInt(s.nextLine());
		pList.add(new Person(name,age));
			
			

		}
		for(Person i:pList) {
			System.out.println(i);
		}
	}
}
