package threads.zynchronized.racecondition;

class Counter{
    private long count = 0;

    public long incAndGet(){
        //synchronized (this){ //todo: toggling this synchronized line changes the behavior
            this.count++;
            return this.count;
        //}
    }
    public long get(){
        return this.count;
    }
}

public class RaceConditionMain {
    public static void main(String[] args) {
        Counter counter = new Counter(); // object shared by both Threads

        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count: "));
        Thread thread2 = new Thread(getRunnable(counter, "Thread2 final count: "));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Counter counter, String message){
        return ()-> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            //todo:
            // The output for the following line of code does not reach 2.000.000 for any of the threads as expected.
            // The reason is that the "count" variable within the "Counter" object sometimes gets updated at the same time by both of the threads,
            // which results in the variable not being incremented by two digits but by one.
            // To fix that situation, we can synchronize the code block where the "count" variable is incremented.
            System.out.println(message + counter.get());
        };
    }
}

