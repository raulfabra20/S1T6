package n1.ex1.models;

public class NoGenericMethods<T> {
    private T animal;
    private T plant;
    private T object;

    public NoGenericMethods(T animal, T plant, T object) {
        this.animal = animal;
        this.plant = plant;
        this.object = object;
    }
    public T getAnimal(){
        return animal;
    }
    public void setAnimal(T animal){
        this.animal = animal;
    }

    public T getPlant() {
        return plant;
    }

    public void setPlant(T plant) {
        this.plant = plant;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}



