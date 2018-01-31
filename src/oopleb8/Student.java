package oopleb8;

//student is sub-class
//Person is super-class
//Pweson is super-class

public class Student extends Person {
private String id;
private String program;
    public Student(String name, String gander, String dateOFBirth, int age, String id, String program) {
        super(name, gander, dateOFBirth, age);
        this.id = id;
        this.program = program;
    }
    //toSting ()

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }

    //getter and setter method


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}//calss