package n1.ex2;

import n1.ex2.models.GenericMethod;
import n1.ex2.models.Person;

public class Application {

    public static void testGenericMethods() {
        Person person = new Person("Raúl", "Fabra", 27);
        String message = "Hello";
        int number = 1;

        GenericMethod gm = new GenericMethod();

        gm.print(message, number, person);

        gm.print(person, message, number);

        gm.print(number, person, message);

    }

}