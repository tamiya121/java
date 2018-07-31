package test02;

public class Test {

	public static void main(String[] args) {
		int a= 5;
		int b = 10;
		
		
		if(a!=b) {
			if(a<b) {
				System.out.println("a보다 b가 크네");
			}
		}
		
		if(a!=b && a<b) {
			System.out.println("a와 b는 다르면서 a보다 b가 크네"); 
		}
		
		if(a==b || a<b) {
			System.out.println("a와 b는 같거나 a보다 b가 크네");
		}

	}

}
