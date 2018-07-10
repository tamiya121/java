package test08;

public class LottoTest {
	public static void main(String[] args) {
	int[] lo = new int[6];
	for(int i=0; i<6; i++)  {
		lo[i] = (int)(Math.random()*45)+1;
		for(int j=0; j<i; j++) {
			if(lo[i]==lo[j]);
			i--;
		}
			
		System.out.println(lo[i]);
		}
	
		}
			
		}
	


