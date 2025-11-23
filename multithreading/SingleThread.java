package com.java.multithreading;

public class SingleThread {
	
	final static int MAX_PRIORITY=10;
	final static int MIN_PRIORITY=1;
	final static int DEFAULT_PRIORITY=5;
	
	public static void main(String args[]) {// ->Main thread SingleThread
		
		//To get the current Thread name we will create the thread object : which is here main thread 
		Thread t=Thread.currentThread();
		
		System.out.println("Thread Name: "+t.getName()); //Current thread here is : main
		
		System.out.println("Thread Priority: "+t.getPriority());// default Priority is 5
		
		t.setPriority(MAX_PRIORITY-1);// We can also set the priority of the threads
		
		t.setName("Anshuman Awasthi"); // we can change the thread name 
		
		System.out.println("Thread toString() method: "+t.toString()); // Thread[threadname,priority,group]
		
		
		for(int i=0;i<5;i++) {// Firstly I will run completely then J will start
			System.out.println("I"+i);
			try {
				Thread.sleep(1000);// using thread sleep method to pause thread temporary
			}catch(InterruptedException e) { // this throws interruptedException 
				e.printStackTrace();
			}

		}
	
		for(int j=0;j<5;j++) {
			System.out.println("J"+j);
		}

	

	}
}
