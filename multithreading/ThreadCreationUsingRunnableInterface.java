

class MyThread implements Runnable{
    public void run(){
            while(true){
                System.out.println("HELLO....");
                try{
                    Thread.sleep(5000);
                }catch(Exception e){
                    e.printStackTrace();
                }
               
            }
    }
}

class MyThread1 implements Runnable{
    public void run(){
            while(true){
                System.out.println("HYEE.......");
                 try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }            }
    }
}

class MyThread2 implements Runnable{
    public void run(){
            while(true){
                System.out.println("HIIII....");
                 try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
    }
}
public class ThreadCreationUsingRunnableInterface {
    public static void main(String[] args) {

        MyThread m1=new MyThread();
        Thread t1=new Thread(m1);
        t1.start();
        MyThread1 m2=new MyThread1();
        Thread t2=new Thread(m2);

        t2.start();
        MyThread2 m3=new MyThread2();
        Thread t3=new Thread(m3);

        t3.start();

        while(true){
            System.out.println("BYEEE........");
             try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }
        }

        
    }
}
