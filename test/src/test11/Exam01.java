package test11;

public class Exam01 {
		public static void main(String[] args) {
			int k[] = new int[6];
			for(int i =0; i<k.length;i++) {
				k[i] =(int)(Math.random()*6+1);
				for(int j =0; j<i; j++) {
					if(k[i]==k[j]) {
						i--;
					}
				}
			}
			for(int i=0; i<k.length; i++) {
				System.out.println(k[i]);
			}
		}
}
