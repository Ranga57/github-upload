import java.util.*;
class Employee implements Comparable{
	int empId;
	String name;
	Employee(String name,int empId){
		this.empId = empId;
		this.name = name;
	}
	public String toString(){
		return name + "--" + empId;
	}
	public int compareTo(Object obj){
		int empId1 = this.empId;
		Employee emp = (Employee)obj;
		int empId2 = emp.empId;
		if(empId1 < empId2)
			return -1;
		else if(empId1 > empId2)
			return 1;
		else 
			return 0;
		
	}

}
class TreeSetDemo3{
	
	public static void main(String[] args){
		Employee e1 = new Employee("nag",100);
		Employee e2 = new Employee("chiru",101);
		Employee e3 = new Employee("venki",102);
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		
		TreeSet t2 = new TreeSet(new MyComparator());
			t2.add(e1);
			t2.add(e2);
			t2.add(e3);
			
		System.out.println(t2);
			
		
		
	}
	
}

class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}