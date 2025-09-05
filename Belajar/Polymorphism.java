package Belajar;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Susi");
        employee.sayHello("Winata");

        employee = new Manager("Hyera", "BCA");
        employee.sayHello("Selly");

        employee = new VicePresident("Mira");
        employee.sayHello("Adi");
    }
    
}
