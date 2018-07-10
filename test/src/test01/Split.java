package test01;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생들의 점수 ,로 구분해서 입력!");
		String pointStr =scan.nextLine();
		scan.close();

		String[] arrStr = pointStr.split(", "); 
		int[] arrNum = new int[arrStr.length];

		for(int i=0;i<arrStr.length;i++) {
			System.out.println((i+1)+"번째 점수: " + arrStr[i]);

		}
	}
}
