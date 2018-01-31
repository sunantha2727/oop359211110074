package oopleb8;

public class Person {
    private String name;
    private String gander;
    private String dateOFBirth;
    private int age;

    public Person(String name, String gander, String dateOFBirth, int age) {
        this.name = name;
        this.gander = gander;
        this.dateOFBirth = dateOFBirth;
        this.age = age;
    }
    //toString()

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gander='" + gander + '\'' +
                ", dateOFBirth=" + dateOFBirth +
                ", age=" + age +
                '}';
    }

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(String dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

