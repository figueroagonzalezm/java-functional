package threads.creation;

public class _ImplementsRunable {
    public static void main(String[] args) {
        System.out.println("Current thread: "+ Thread.currentThread().getName()); // main thread

        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Executing Thread: "+ Thread.currentThread().getName()); // Thread-0
    }
}
