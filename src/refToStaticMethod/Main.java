package refToStaticMethod;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, Double> sqrt = Math ::sqrt;
        System.out.println(sqrt.apply(100.0d));
        Function<Double, Double> sqrtLambda = x -> Math.sqrt(x);
    }
}
