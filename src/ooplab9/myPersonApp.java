package ooplab9;

public class myPersonApp {
    public static void main(String[] args) {
        Address address = new Address("4","Nakhonsitammarad","80140");
        Job job = new Job("Adminitation",30000);
        Person person = new Person("001","Sunantha",address,job);
        System.out.println(person.toString());
    }
}
