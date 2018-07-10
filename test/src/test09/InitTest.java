package test09;

public class InitTest {
	int n = 10;
	String str = "abc";
	
	
	public static void main(String[] args) {
		InitTest it = new InitTest();
		it.n = 1000;
		System.out.println(it.n);
		it = new InitTest();
		System.out.println(it.n);
	}

}
