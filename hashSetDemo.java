import java.util.HashSet;
class HashSetDemo{
	public static void main(String[] args){
		HashSet h = new HashSet();
		h.add("a");
		h.add(20);
		h.add("Null");
		System.out.println(h.add("a"));
		System.out.println(h);
		
	}
}