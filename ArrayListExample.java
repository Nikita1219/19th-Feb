import java.util.*;
import java.util.ArrayList;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id , String name, String author, String publisher, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book(101, " Let Us C", "Nikita Jayaswal","bpb",8);
		Book b2 = new Book(102,"let u","niharika","bhj",9);
		Book b3 = new Book(103,"let me","kanika","ghj",10);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}
