package test09;

public class Son extends Father{

	public void test() {
		this.run();
		super.test();
	}
	public void run() {
		System.out.println("본인이 달려!!");
		}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.test();
	}
}
