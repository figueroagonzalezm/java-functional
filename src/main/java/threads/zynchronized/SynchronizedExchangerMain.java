package threads.zynchronized;

public class SynchronizedExchangerMain {
    public static void main(String[] args) {
        SynchronizedExchanger exchanger = new SynchronizedExchanger();
        //todo: When a thread executes a synchronized method, all other synchronized methods in the object instance get locked.

        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 100; i++) {
                            System.out.println("setObject Thread: " +
                                    Thread.currentThread().getName() +": "+ i);
                            exchanger.setObject("" + i);
                        }
                    }
                }
        );

        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 100; i++) {
                            System.out.println("getObject Thread: " +
                                    Thread.currentThread().getName() + ": " +
                                    exchanger.getObject());
                        }
                    }
                }
        );

        Thread thread3 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 100; i++) {
                            System.out.println("getObject_NotSynchronized Thread: " +
                                    Thread.currentThread().getName() + ": " +
                                    exchanger.getObject_NotSynchronized());
                        }
                    }
                }
        );

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
