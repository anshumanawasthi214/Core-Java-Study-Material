class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("BYEEE CHILDD.............");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ExampleClass {
	public static void main(String args[]) {
		MyThread t1=new MyThread();
		t1.start();
		
		while(true) {
			System.out.println("HELLO MAIN");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
