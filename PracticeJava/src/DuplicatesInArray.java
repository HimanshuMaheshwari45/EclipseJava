import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Himanshu");
		names.add("Deepanshu");
		names.add("Himanshu");
		names.add("Ayush");
		names.add("Ayush");
		names.add("Himanshu");
		names.add("Ayush");
		
		Set<String> S = new HashSet<>();
		
		for (String name : names) {
			
			if(S.add(name) == false) {
				System.out.println(name);
				
				
			}
			//System.out.println(name);
			
		}
		
		
		

	}

}
