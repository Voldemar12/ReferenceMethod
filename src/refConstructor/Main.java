package refConstructor;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Person> personGenerator = Person::new;
        Person johnFoster = personGenerator.apply("Adele Walten");

        Function<String, Person> personGeneratorLambda = name -> new Person(name);
    }
}
