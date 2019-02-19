import java.util.*;
public class TestVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("umesh"); //method collection
		v.addElement("john"); //method of vector
		v.addElement("kumar");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
