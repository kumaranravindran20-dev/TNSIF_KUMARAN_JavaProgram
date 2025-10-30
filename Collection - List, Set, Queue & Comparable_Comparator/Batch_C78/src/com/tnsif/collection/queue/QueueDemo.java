package com.tnsif.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		
		//Add the elements
		for(int i=0;i < 5; i++)
			q.add(i);
		
		//Display the queue
		System.out.println("Elements of Queue: "+q);

		//To remove the head of the element
		int removable = q.remove();
		System.out.println("Removed Element: "+ removable);
		
		//To view the top(head)of the element
		int head = q.peek();
		System.out.println("Head of the Element: "+ head);
		
		//To find the queue size
		int size = q.size();
		System.out.println("Size of queue: "+ size);
	}
	
	

}
