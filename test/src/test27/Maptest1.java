package test27;

import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Maptest1 {
	static ArrayList<HashMap<String,String>> getList(){
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		for(int i=0; i<3; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			
			
			hm.put("name", "나나나");
			hm.put("age","600");
			al.add(hm);
			}
			return al;
	}

	
	
	
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> al = getList();
		for(HashMap<String,String> hm:al) {
			System.out.println(hm);
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println(getList().get(2));
		}
	
	}
		
}
