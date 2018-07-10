package Assignment1;
import java.util.*;

public class MyStack {
	 static void pushValue(Stack<Integer> stackValue, int value) {
		 stackValue.push(new Integer(value));
	      System.out.println("Stack sau khi push "+ value + " value: " + stackValue);
	   }

	   static void popValue(Stack<Integer> stackValue) {
	      System.out.print("Thực hiện Pop............");
	      Integer value = stackValue.pop();
	      System.out.println("Giá trị được pop ra là: " + value);
	      System.out.println("Stack sau khi pop: " + stackValue);
	   }
	   static void getValue(Stack<Integer> stackValue,int position) {
		System.out.println("Giá trị của stack ở vị trí "+ position +" là :" + stackValue.get(position));
	}
	public static void main(String[] args) {
		Stack<Integer> stackValues = new Stack<Integer>();
		pushValue(stackValues,18);
		pushValue(stackValues,7);
		pushValue(stackValues,1997);
		pushValue(stackValues,187);
		popValue(stackValues);
		popValue(stackValues);
		getValue(stackValues, 1);
	}
}
