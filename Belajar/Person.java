package Belajar;

public class Person {
    String address;
    String name;
    public String country;

    public static void main(String[] args) {
        String name;
        String address;
        final String country = "Indonesia";

        var person = new Person();
        person.name = "Winata";
        person.address = "Jakarta";
        person.sayHello("Susi");
        

        System.out.println(person.name);
        System.out.println(person.address);
    }
    
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
