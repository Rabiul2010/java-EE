package rabiul.cu.cse;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// create a queue
		Queue<String> queue = new LinkedList<String>();

		// adding into the queue
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("5");

		// displaying the content of the queue
		System.out.println("content of queue " + queue);

		// popping an element from queue
		try {
			queue.remove();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("emphty queue");
		}

		// displaying the content of the queue
		System.out.println("Content of the queue after remove: " + queue);
	}

}
