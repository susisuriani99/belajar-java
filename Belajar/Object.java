package Belajar;

public class Object {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Susi";
        person1.address = "Jakarta";
        person1.country = "Indonesia";
        Person person2 = new Person();
        person2.name = "Hyera";

        Person person3;
        person3 = new Person();
        person3.name = "Selly";

        person1.sayHello("Kayla");
        person2.sayHello("Winata");
        person3.sayHello("Jungmo");
    }
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
    
}
