package Belajar;

public class Person {
    private String address;
    protected String name;
    public String country;
    public int age;

    Person(String paramName, String paramAddress, int age) {
        this.name = paramName;
        this.address = paramAddress;
        this.age = age;
    }
    public static void main(String[] args) {
        var person = new Person("Winata", "Jakarta", 28);
        // person.sayHello("Susi", "Bandung",26);
        // System.out.println(x);
        // person.sayHello2();
        // person.sayHello3();

        // System.out.println(person.name);
        // System.out.println(person.address);
        // System.out.println(person.age);
        person.sayHello3();
        person.birthday();
        person.sayHello3();
        person.birthday();
        person.sayHello3();
        person.changeAddress("tangsel");
        person.sayHello3();
    }
    
    String sayHello(String paramName, String paramAddress, int paramAge) {
        return "Hello " + paramName + ", my name is " + name + ". I'm from " + paramAddress + ". I'm " + paramAge + " years old.";
    }
    
    void birthday() {
        System.out.println("Happy Birthday, " + this.name);
        this.age++;
    }
    void sayHello2() {
        System.out.println("Hello " + this.name + ", My name is " + this.name + " I'm from " + this.address);
    }

    void sayHello3() {
        System.out.println("Hello, my name is " + this.name + ". I'm from " + this.address + ". I'm " + this.age + " years old.");
    }

    void changeAddress(String newAddress) {
        System.out.println("changing address of " + this.name + " from " + this.address + " to " + newAddress);
        this.address = newAddress;
    }
}
