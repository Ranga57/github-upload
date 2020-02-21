import java.util.LinkedHashSet;
class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet h = new LinkedHashSet();
		h.add("a");
		h.add(20);
		h.add("Null");
		System.out.println(h.add("a"));
		System.out.println(h);
		
	}
}