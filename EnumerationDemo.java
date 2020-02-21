import java.util.Enumeration;
import java.util.Vector;
class EnumerationDemo{
	public static void main(String[] args){
		Vector v = new Vector();
		v.addElement("a");
		v.add("b");
		v.add("c");
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
