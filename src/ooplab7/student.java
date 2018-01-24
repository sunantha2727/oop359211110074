package ooplab7;
//talking about Student?
// 1.student ID
//2.Name
//3.Address
//4.Gender


public class student {
    //properties of Student
    private String id;
    private String name;
    private String address;
    private String gender;
    //Constructor
    //Defaut  Constructor
    public student(){}
    //Constructor by own
    public student(String id,String n,String a,String g){
        //assign data to properties
        this.id=id;
        this.name=n;
        this.address=a;
        this.gender=g;

    }//student
    //getter and setter methods\


    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}//class
