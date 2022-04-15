package functional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        System.out.println(addBy1Function.apply(1));
        System.out.println(incrementByOneAndMultiplyByFunction.apply(1, 10));
    }
    //todo: Function receive ONE parameter and return one result
    static Function<Integer,Integer> addBy1Function = number-> number + 1;

    //todo: BiFunction receive TWO parameters and return one result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
