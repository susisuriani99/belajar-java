package Belajar;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursive(10));
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }
}
