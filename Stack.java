public class Stack
{
  private int arraySize;
  private String[] stackArray;
  private int top;
  //
  public Stack(int item)
  {
	 // arraySize = item;
	  stackArray = new String[item];
	  top = -1;
  }
  //push the element in Stack
  public String push(String item){
	  return stackArray[++top] = item;
  }
  //check for Stack is  empty or not
  public boolean isEmpty()
  {
	  return top ==-1;
  }
  
  //pop the stack 
  public String pop()
  {
	  return stackArray[top--];
  }
  public String peek()
  {
	  return stackArray[top];
  }
  //main
public static void main(String args[])
{
 Stack stack = new Stack(11);
	 stack.push("aa");
	 stack.push("b");
	 stack.push("c");
	 stack.push("d");
	 System.out.println(stack.peek());
	 stack.push("e");
	 stack.push("g");
		//System.out.println("peek");
	 System.out.println("peek = "+stack.peek());
	 while(!stack.isEmpty())
	 {
		String item = stack.pop();
		System.out.println(item);
		System.out.print(" ");
	 }
	System.out.println(" ");
	
}
}