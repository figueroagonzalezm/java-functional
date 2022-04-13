package callbacks;

public class Main {
    public static void main(String[] args) {

        greetingMethod("Miguel", ()-> {
            System.out.println("parameter 'name' is null");
        });

        greetingMethod(null, ()-> {
            System.out.println("parameter 'name' is null");
        });
    }

    static void greetingMethod(String name, BasicInterface callback){
        if(name!=null){
            System.out.println("Hello "+ name);
        }else{
            callback.saySomething();
        }
    }
}
