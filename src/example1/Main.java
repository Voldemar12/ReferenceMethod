package example1;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> max = Integer :: max;
        IntBinaryOperator max2 = Integer :: max;
        System.out.println(max.apply(5, 6));

        BiFunction<Integer, Integer, Integer> maxLambda = (x, y) -> Integer.max(x, y);
    }
}