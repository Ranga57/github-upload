import java.util.ArrayList;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList arrayList = new ArrayList();
		arrayList.add("A");
		arrayList.add(10);
		arrayList.add("a");
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.add(2,"3");
		arrayList.add("N");
		System.out.println(arrayList);
	}
}