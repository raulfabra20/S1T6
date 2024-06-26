package n1.ex1;

import n1.ex1.models.NoGenericMethods;

public class Application {


    public static void createObjects(){
        NoGenericMethods<String> obj1 = new NoGenericMethods<>("First", "Second", "Third");

        NoGenericMethods<String> obj2 = new NoGenericMethods<>("Second", "Third", "First");

        NoGenericMethods<String> obj3 = new NoGenericMethods<>("Third", "First", "Second");

    }




}
