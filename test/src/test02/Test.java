package test02;

public class Test {

	public static void main(String[] args) {
		int a= 5;
		int b = 10;
		
		
		if(a!=b) {
			if(a<b) {
				System.out.println("a�� b���� �۳� ������");
			}
		}
		
		if(a!=b && a<b) {
			System.out.println("a�� b�� �ٸ��鼭 a�� b���� �۳׿�"); 
		}
		
		if(a==b || a<b) {
			System.out.println("a�� b�� �ٸ��ų� a�� b���� �۳׿�");
		}

	}

}
