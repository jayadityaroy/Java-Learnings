// Runnable is also used to create a thread. 
// It is a functional interface and has only one method run(),
// it is used to create a thread when we want to extend another class as well and can't extend Thread class.
package Threads;
class A{

}
class Thread3 extends A implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread3");
        }   
    }
}

public class Example2 {

    public static void main(String[] args) {
        // creating Thread3 object
        Runnable r3 = new Thread3();
        // Using anonymous inner class to create a thread by implementing Runnable interface.
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 10; i++){
                    System.out.println("Thread4");
                }   
            }
        };
        // Using lambda expression to create a thread by implementing Runnable interface.
        Runnable r5 = () -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("Thread5");
            }   
        };
        // creating thread objects and passing Runnable objects to them.
        // since, we can't use start() method on object of classes implementing Runnable interface (since Runnable don't have start() method),
        // so we need to create a thread object and pass the Runnable object to it.
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);
        t3.start();
        t4.start();
        t5.start();
    }
    
}
