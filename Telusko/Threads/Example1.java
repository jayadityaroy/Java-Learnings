// creating two threads by extending Thread class and running them parallelly
package Threads;
class Thread1 extends Thread{
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println("Thread1");
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i =1; i <= 100; i++){
            System.out.println("Thread2");
        }
    }
}
public class Example1 {
    
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }


}
