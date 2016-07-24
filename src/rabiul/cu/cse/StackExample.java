package rabiul.cu.cse;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// create a stack
		Stack<String> stack = new Stack<String>();

		// push into stack
		stack.push("Mohammad Aminul Islam");
		stack.push("Mohammad Rabiul Islam");
		stack.push("Abdullah Al Mohammad Maruf");
		stack.push("Swarup Muhuri");
		stack.push("Nishan Das");
		/*
		 * stack.push(1); stack.push(2); stack.push(3); stack.push(4);
		 * stack.push(5);
		 */

		// displaying the content of stack
		System.out.println("content of the stack :" + stack);

		// popping an element from stack
		try {
			stack.pop();
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("emphty stack");
		}

		// content of stack after pop
		System.out.println("content of stack :" + stack);
		// search in the stack
		System.out.println("Does stack contain Nishan Das :"
				+ stack.search("Nishan Das"));
		System.out.println("Does stack contain Mohammad Rabiul Islam :"
				+ stack.search("Mohammad Rabiul Islam"));
		/*
		 * System.out.println("content of stack "+stack);
		 * System.out.println(+stack.search(5));
		 * System.out.println(+stack.search(2));
		 */

	}

}
