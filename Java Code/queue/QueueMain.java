package queue;

import java.util.Scanner;

import stack.Stack;

public class QueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int n= sc.nextInt();
		Queue q= new Queue(n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			int val= sc.nextInt();
			q.enqueue(val);
		}
		
		q.printQueue();
		
		q.dequeue();
		q.printQueue();
		
		
		q.dequeue();
		q.printQueue();
	}
}
