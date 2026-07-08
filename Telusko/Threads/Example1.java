// creating two threads by extending Thread class and running them parallelly
package Threads;
class Thread1 extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread1");
            try {
                sleep(10); // sleep() method is used to pause the execution of the thread for a specified time. It throws InterruptedException, so we need to handle it.
            } catch (InterruptedException e) {e.printStackTrace();} 
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i =1; i <= 10; i++){
            System.out.println("Thread2");
        }
        try {
            sleep(10);
        } catch (InterruptedException e) {e.printStackTrace();
        }
    }
}
public class Example1 {
    
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start(); // start() method is used to start the execution of the thread. It calls the run() method of the thread.
        t2.start();
    }


}
