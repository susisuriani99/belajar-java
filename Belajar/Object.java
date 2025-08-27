package Belajar;

public class Object {
    public static void main(String[] args) {
        var person1 = new Person("Susi", "Jakarta", 26);
        person1.name = "Adi";
        person1.country = "Indonesia";
        Person person2 = new Person("Yera", "Tangerang",22);
        person2.name = "Hyera";

        Person person3;
        person3 = new Person("Jungmo", "Seoul", 25);
        person3.name = "Selly";

        person1.sayHello("Kayla", "abc", 22);
        changeName("Winata", person1);
        person1.sayHello2();
        person2.sayHello("Winata", "def", 28);
        person3.sayHello("Jungmo", "ghi", 25);
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
