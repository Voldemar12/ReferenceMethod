package refToInstanceMethod;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String whatsGoingOnText = "What is going on here?";
        Function<String, Integer> indexWithString = whatsGoingOnText :: indexOf;
        System.out.println(indexWithString.apply("going"));

        Function<String, Integer> indexWithLambda = string -> whatsGoingOnText.indexOf(string);
    }
}
