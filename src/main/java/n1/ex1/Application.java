package n1.ex1;

import n1.ex1.models.NoGenericMethods;

public class Application {

    public static void createObjects(){
        NoGenericMethods<String> obj1 = new NoGenericMethods<>("Sunshower", "Fork", "Shark");

        NoGenericMethods<String> obj2 = new NoGenericMethods<>("Fork", "Shark", "Sunshower");

        NoGenericMethods<String> obj3 = new NoGenericMethods<>("Shark", "Sunshower", "Fork");
    }
}
