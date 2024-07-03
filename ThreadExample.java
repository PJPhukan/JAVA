//Thread using extends Thread

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("My Thread1 is Running ...");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("My Thread2 is Running ...");
            System.out.println(Thread.currentThread().getPriority());
        }

    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // set priority of thead
        t1.setPriority(4);
        t2.setPriority(1);
        // OR

        // Setting priorities
        // t1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        // t1.setPriority(Thread.NORM_PRIORITY); // Normal priority (5)
        // t1.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)

        t1.start();
        t2.start();
        System.out.println("Priority of thread 1 is " + t1.getPriority());
    }
}
