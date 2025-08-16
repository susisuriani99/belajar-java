package Belajar;

public class Method {
    public static void main(String[] args) {
        sayHelloWord();
        sayHelloWord();
        sayHello("Susi", "Suriani");
        sayHello("Adi", "Winata");
    }

    static void sayHelloWord() {
        System.out.println("Hello World");
        System.out.println("Hello World 1");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}