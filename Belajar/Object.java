package Belajar;

public class Object {
    public static void main(String[] args) {
        var person1 = new Person("Susi", "Jakarta");
        person1.name = "Adi";
        person1.country = "Indonesia";
        Person person2 = new Person("Yera", "Tangerang");
        person2.name = "Hyera";

        Person person3;
        person3 = new Person("Jungmo", "Seoul");
        person3.name = "Selly";

        person1.sayHello("Kayla", "abc");
        changeName("Winata", person1);
        person1.sayHello2();
        person2.sayHello("Winata", "def");
        person3.sayHello("Jungmo", "ghi");
        person3.sayHello2();
        sayHello("Timo");
    }
    static void changeName(String newName, Person person) {
        person.name = newName;
    }
    static void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + paramName);
    }
    
}
