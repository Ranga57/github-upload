import java.util.TreeSet;

class TreeSetDemo1{
	public static void main(String[] args){
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("c"));
		t.add(new StringBuffer("L"));
		//t.add(new Integer(20));
		//t.add(null);
		System.out.println(t);
	}
	
}