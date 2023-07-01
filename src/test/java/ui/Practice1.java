package ui;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Practice1 {

	public static void main(String[] args) {
//		String s="Speeding,Other";
//		String dates[]=s.split(",");
//		for(String date:dates) {
//			System.out.println(date);
//		}
//		String currentProjectLocation=System.getProperty("user.dir");
//		System.out.println(currentProjectLocation);
		
		HashMap<Integer,String> entry= new HashMap<>();
		entry.put(1000,"Monu");
		entry.put(2, "Priye");
		entry.put(300, "Rajesh");
		
		System.out.println(entry);
		//System.out.println(entry.get());
		
	}

}
