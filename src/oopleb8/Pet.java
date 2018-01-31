package oopleb8;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }
    //abstract method
public abstract void makeNoise();
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
