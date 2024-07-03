
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("I am inside implement Runnable thread ..");
        System.out.println("Priority of this thread " + Thread.currentThread().getPriority());
    }
}

public class ThreadRunnable {
    public static void main(String[] args) throws Exception {
        //Thread 1
        MyRunnable t1 = new MyRunnable(); // create a new object of MyRunnable class
        Thread thread1 = new Thread(t1);// create new thread
        thread1.setPriority(Thread.MAX_PRIORITY); // set priority 9 of that thread
        thread1.start();// start the running of that thread
    
        //Thread 2
        MyRunnable t2 = new MyRunnable(); // create a new object of MyRunnable class
        Thread thread2 = new Thread(t2);// create new thread
        thread2.setPriority(Thread.MIN_PRIORITY); // set priority 9 of that thread
        thread2.start();// start the running of that thread
    }
}
