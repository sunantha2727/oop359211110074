package ooplab9;

public class Person {
    private String personID;
    private String name;
    private Address ddress;
    private Job job;

    public Person(String personID, String name, Address ddress, Job job) {
        this.personID = personID;
        this.name = name;
        this.ddress = ddress;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", ddress=" + ddress +
                ", job=" + job +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getDdress() {
        return ddress;
    }

    public void setDdress(Address ddress) {
        this.ddress = ddress;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
