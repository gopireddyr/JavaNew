package leetcode;

import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		PriorityQueue myqueue=new PriorityQueue();
		myqueue.add(30);
		myqueue.add(10);
		myqueue.add(15);
		System.out.println(myqueue.size());
		while(myqueue.size()>0)
		{
			System.out.println(myqueue.peek());
			myqueue.poll();
		}
	}
	
}
