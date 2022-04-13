package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(dbConnectionUrlSupplier.get());  //   "jdbc://localhost:5432/users"

    }
    //todo: Supplier receive NO parameters and return ONE result
    static Supplier<String> dbConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
}
