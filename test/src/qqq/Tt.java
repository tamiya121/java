package qqq;

public class Tt {
public static void main(String[] args) {
	int[] a = new int[6];
	for(int i=0; i<6; i++) {
		double d = Math.random()*45+1;
		int c = (int)d;
		for(int j =0; j<i; j++) {
			if(a[i]==a[j]) {
				i--;
			}
		}
		
		
		System.out.println(i);
	}
}
}
