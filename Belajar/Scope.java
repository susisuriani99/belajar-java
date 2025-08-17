package Belajar;

public class Scope {
    public static void main(String[] args) {
        String[] names = {"Winata", "Selly", "Adi"};
        // sayHello("Winata");
        // sayHello("Susi");
        sayHello(names[1]);
    }
    static void sayHello(String name) {
        String hello = "Hello " + name;
        if(!name.isBlank()) {
        String hi = "Hi " + name;
        System.out.println(hi);
        }
    
        System.out.println(hello);
    }
}
