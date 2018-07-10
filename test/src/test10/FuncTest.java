package test10;

public class FuncTest {
	public void add(int a, int b) {
		System.out.println("인트더하기 : " + (a + b));
	}

	public void add(long a, long b) {
		System.out.println("롱더하기 : " + (a + b));
	}

	public static void main(String[] args) {
		 FuncTest f = new  FuncTest();
		 f.add(1, 2234234);
		 f.add(12341243l, 324234l);
	}

	
}
