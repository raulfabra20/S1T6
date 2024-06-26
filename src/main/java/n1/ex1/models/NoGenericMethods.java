package n1.ex1.models;

public class NoGenericMethods<T> {
    private T one;
    private T two;
    private T three;

    public NoGenericMethods(T one, T two, T three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    public T getOne(){
        return one;
    }
    public void setOne(T one){
        this.one = one;
    }

    public T getTwo() {
        return two;
    }

    public void setTwo(T two) {
        this.two = two;
    }

    public T getThree() {
        return three;
    }

    public void setThree(T three) {
        this.three = three;
    }
}



