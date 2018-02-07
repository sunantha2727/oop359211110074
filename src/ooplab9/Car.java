package ooplab9;


public class Car {
    private String brand;
    private String color;
    private String modal;
    private Engine engine;

    public Car(String brand, String color, String modal, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.modal = modal;
        this.engine = engine;
    }
    //toSring

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", modal='" + modal + '\'' +
                ", engine=" + engine +
                '}';
    }

    //gatter and setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
