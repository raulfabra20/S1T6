package n1.ex1;

import n1.ex1.models.NoGenericMethods;

public class Application {

    public static void createObjects(){
        NoGenericMethods<Integer> obj1 = new NoGenericMethods<>(12, 15, 19);

        NoGenericMethods<String> obj2 = new NoGenericMethods<>(19, 12, 15);

        NoGenericMethods<String> obj3 = new NoGenericMethods<>(15, 19, 12);
    }
}
