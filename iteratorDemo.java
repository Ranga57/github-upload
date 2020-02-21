import java.util.Iterator;
import java.util.ArrayList;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		for(int i=0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Integer num = (Integer)itr.next();
			if(num%2 == 0)
				System.out.println(num);
			else
				itr.remove();
		}
		System.out.println(al);
	}
}