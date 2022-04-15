package threads.zynchronized;

public class StaticSynchronizedExchanger {
    private static Object object = null;

    public static synchronized Object getObject() {
        return object;
    }

    public static synchronized void setObject(Object o) {
        object = o;
    }

    public static void setObj(Object o){
        //todo: in statics methods the monitor object is the class
        synchronized (StaticSynchronizedExchanger.class){
            object = o;
        }
    }
    public static Object getObj(){
        synchronized (StaticSynchronizedExchanger.class){
            return object;
        }
    }
}
