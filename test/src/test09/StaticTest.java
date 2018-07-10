package test09;

public class StaticTest {
	static int numSt = 10;
	int num = 20;
	
	public static void main(String[] args) {
		System.out.println(StaticTest.numSt);
		Test t = new Test();
	t.chNum();
	System.out.println(StaticTest.numSt);
	StaticTest.numSt = 30;
	t.chNum();
	System.out.println(StaticTest.numSt);
	}
}
