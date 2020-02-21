import java.util.Stack;
class StackDemo{
	public static void main(String[] args){
		Stack newStack = new Stack();
		newStack.push("A");
		newStack.add("B");
		System.out.println(newStack.peek());
		System.out.println(newStack);
		newStack.pop();
		System.out.println(newStack);
		System.out.println(newStack.search("A"));
		
		
	}
}