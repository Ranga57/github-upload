import java.util.concurrent.*;
import java.util.*;
			class MyThread extends Thread{
				static ArrayList cwl = new ArrayList();
				public void run(){
					try{
						Thread.sleep(2000);
					}catch(InterruptedException ie){
					}
					System.out.println("child Thread updating list");
					cwl.add("c");
				}
				public static void main(String[] args) throws InterruptedException{
					cwl.add("a");
					cwl.add("b");
					MyThread t = new MyThread();
					t.start();
					Iterator itr = cwl.iterator();
					while(itr.hasNext()){
						String s1 = (String)itr.next();
						System.out.println("main thread iterating list and current object is:" + s1);
						Thread.sleep(3000);
					}
					System.out.println(cwl);
				}
			}