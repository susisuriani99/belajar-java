package Belajar;

public class VariableHiding {
    String name;
    void doIt() {
        System.out.println("Do it from Parent");
    }

class Child extends VariableHiding {
    String name;
    void doIt() {
        System.out.println("Do it from Child");
    }
}
}
