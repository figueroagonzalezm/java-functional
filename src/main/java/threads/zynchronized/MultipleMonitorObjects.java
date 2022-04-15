package threads.zynchronized;

public class MultipleMonitorObjects {

    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    public void incrementCounter1(){
        synchronized (monitor1){
            counter1++;
        }
    }
    public void incrementCounter2(){
        synchronized (monitor2){
            counter2++;
        }
    }
}
