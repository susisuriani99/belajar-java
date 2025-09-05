package Belajar;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Susi");
        employee.sayHello("Winata");

        employee = new Manager("Hyera", "BCA");
        employee.sayHello("Selly");

        employee = new VicePresident("Mira");
        employee.sayHello("Adi");
        
        sayHello(new Employee("Hani"));
        sayHello(new Manager("Ryani"));
        sayHello(new VicePresident("Nara"));
        sayHello(employee);
        sayHello1(employee);
    }
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
    static void sayHello1(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
    
}
