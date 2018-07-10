package test08;

public class IntegerArray {
	public static void main(String[] args) {
		int[] sd = new int[6];
		for (int i = 0; i < 6; i++) {
			sd[i] = (int)(Math.random()*6+1);
			for(int j =0; j<i; j++) {
				if(sd[i]==sd[j]) {
					i--;
				}
			}
		
			
		}
		
		
		
	}
}
