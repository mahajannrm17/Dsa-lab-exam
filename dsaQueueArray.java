package com.main;
import java.util.*;


		public class dsaQueueArray {
	
		int[] queueArray;
	    int front, rear, size;

	    public dsaQueueArray(int size) {
	        this.size = size;
	        queueArray = new int[size];
	        front = -1;
	        rear = -1;
	    }

	    public boolean isFull() {
	        return (rear == size - 1);
	    }

	    public boolean isEmpty() {
	        return (front == -1 || front > rear);
	    }

	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full!");
	            return;
	        }
	        queueArray[++rear] = item;
	        if (front == -1) {
	            front = 0;
	        }
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty!");
	            return -1;
	        }
	        return queueArray[front++];
	    }
	    
	    void display()
	   {
		   int i;
		    if (isEmpty()) {
		      System.out.println("Empty Queue");
		    }
		    else {
		    
		      // display element of the queue
		      System.out.println("Items -> ");
		      for (i = front; i <= rear; i++)
		        System.out.print(queueArray[i] + "  ");
		      	System.out.println(" ");

		     
		    }
		  }

	    	public static void main(String[] args) {
	    	dsaQueueArray q = new dsaQueueArray(5);
	        q.enqueue(11);
	        q.enqueue(32);
	        q.enqueue(43);
	        q.enqueue(45);
	        q.enqueue(57);
	        q.display();
	        System.out.println("item deleted from queue=" + q.dequeue());
	        System.out.println("item deleted from queue=" +q.dequeue());
	        q.display();
	    }
	}
