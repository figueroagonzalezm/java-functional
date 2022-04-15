package threads.creation;



public class _ExtendsThread{
    public static void main(String[] args) {
        System.out.println("Current thread: "+ Thread.currentThread().getName()); // main thread

        MyThread1 myThread = new MyThread1();
        myThread.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("executing new thread: " + this.getName()); // Thread-0
    }
}