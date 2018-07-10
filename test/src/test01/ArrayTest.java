package test01;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 2;
		arr[0] = 2;
		arr[0] = 2;
		int[] tmparr = arr;
		
		arr = new int[5];
		arr[0] = tmparr[0];
		arr[1] = tmparr[1];
		arr[2] = tmparr[2];
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i + "]="+arr[i]);
			
		}

	}
}
