import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class MyBasicArrayList {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("nikita");
		a1.add("neeti");
		a1.add("niharika");
		a1.add("kanika");
		a1.add("sanchita");
		System.out.println(a1);
		System.out.println("Element at index 1:" +a1.get(1));
		System.out.println("Does list contains nikita ?" +a1.contains("nikita"));
		a1.add(2, "gaurav");
		System.out.println(a1);
		System.out.println(" Is array list empty ?" +a1.isEmpty());
		System.out.println("Index of neeti is " +a1.indexOf("neeti"));
		System.out.println("Size of the arryList is " +a1.size());
		Collections.sort(a1);
		System.out.println(a1);
	}

}
