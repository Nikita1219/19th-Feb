import java.util.ArrayList;
import java.util.List;

class PlayersList
{
	ArrayList playerArray = new ArrayList();
	List subListObj = new ArrayList();


	PlayersList()
	{
		playerArray = new ArrayList();
		subListObj = new ArrayList();
	}

	void add()
	{
		for(int ctr=0;ctr<5;ctr++)
		{
			playerArray.add("Martina");
			playerArray.add("Serna");
			playerArray.add("venus");
			playerArray.add("Serna");	
			System.out.println();
		}
	}
	void search()
	{
		System.out.println();
		System.out.println("**************************" + "*********************");
		System.out.println("search for an object and return " + "the first and the last position ");
		System.out.println("**************************" + "**********************");
		System.out.println();
		System.out.println("first occurance of the string " + " \"Serna\" is at position " + playerArray.indexOf("Serna"));
		System.out.println("last occurance of the string " + " \"Serna\" is at position " + playerArray.indexOf("Serna"));
		System.out.println();
	}
	void display()
	{
		System.out.println("**************************" + "*********************");
		System.out.println("retrieve array from the ArrayList");
		System.out.println("**************************" + "*********************");
		System.out.println();
		for(int ctr=0; ctr<playerArray.size(); ctr++)
		{
			System.out.println("" +playerArray.get(ctr));
		}
	}
	void extract()
	{
		System.out.println("**************************" + "*********************");
		System.out.println("Extract a sublist" + "then print the new list");
		System.out.println("**************************" + "*********************");
		System.out.println();
		subListObj = playerArray.subList(5,  playerArray.size());
		System.out.println("New sub-list from index 5 to " + playerArray.size() + "is : "+ subListObj);
		System.out.println();
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayersList plobj = new PlayersList();
		plobj.add();
		plobj.search();
		plobj.display();
		plobj.extract();
	}

}
