package queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		mq.enqueue(12);
		mq.enqueue(13);
		mq.enqueue(45);
		mq.enqueue(56);
		mq.enqueue(9);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		 
		
		
		

	}

}
