import java.util.*;
public class LinkedListDemo{
	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		l1.add("durga");
		l1.add(30);
		l1.add(null);
		l1.add("durga");
		l1.set(0,"software");
		l1.add(0,"venky");
		l1.addFirst("ccc");
		System.out.println(l1);
	}
}