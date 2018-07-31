package qqq;

public class Tt {
public static void main(String[] args) {
	int[] a = new int[6];
	for(int i=0; i<a.length; i++) {
		a[i]  = (int)(Math.random()*6)+1;
		
		for(int j =i+1; j<i; j++) {
			if(a[i]==a[j]) {
				i--;
			}
		}
		
		
		System.out.println(a[i]);
	}
}
}
