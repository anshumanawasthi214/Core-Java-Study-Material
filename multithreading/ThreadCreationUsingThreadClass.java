
/* There is one Thread available by Default which is Main thread 
 * to create a child thread by using thread class we must need to do below things :
 * 			=>Extend the thread class with our class
 * 			=>Create the object of thread class inside main method
 * 			=>use obj.start()[main class] method to load the child thread into Queue
 * 			=>Override run()[My thread class] method to give the tasks to child thread.
 * 
 */


class MyThread extends Thread{
		public void run() /*throws Exception X  because we must keep the signature same as super class
		 					so we need to handle the exception using try-catch block */ 
						 {
			
			//Tasks for Child Thread
			System.out.println("Child Thread started");
			
			for(int i=0;i<=5;i++) {
				System.out.println("Child Thread is running for "+i);
				try {
					Thread.sleep(55);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Child Thread stopped");

		}

}
public class ThreadCreationUsingThreadClass{

	public static void main(String args[]) {
		System.out.println("Main Thread started");

		MyThread t1=new MyThread();//Child Thread Created

		t1.start();// loads the child thread into Queue
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread is running for "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Task for main thread should be write here 
		System.out.println("Main Thread stopped");
		
	}
}
