package Belajar;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println("Factorial Loop " + factorialLoop(5));
    }

    public static void main1(String[] args) {
        System.out.println("Factorial Recursive " + factorialRecursive(5));
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }
    static int factorialLoop(int value) {
        var result = 1;
        
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        main1(null);
        main2(null);
        main3(null);
        main4(null);
        main5(null);
        main6(null);
        return result;
    }

    public static void main2(String[] args) {
        System.out.println("Power Loop " + powerLoop(3, 5));
    }
    static int powerLoop(int value, int pangkat) {
        int result = value;
        for (var counter = 1; counter < pangkat; counter++) {
            result *= value;
        }
        return result;
    }
    public static void main3(String[] args) {
        System.out.println("PowerRecursive " + powerLoop(3, 5));
    }
    static int powerRecursive(int value, int pangkat) {
        if (pangkat == 1) {
            return 1;
        } else {
            return value * powerRecursive(value, pangkat-1);
        }
    }

    public static void main4(String[] args) {
        System.out.println("Perkalian Loop " + perkalianLoop(3, 10));
    }

    static int perkalianLoop(int value1, int value2) {
        int result = value1;
        for (var counter = 1; counter < value2; counter++) {
            result += value1;
        }

        return result;
    }

    public static void main5(String[] args) {
        System.out.println("Perkalian Recursive " + perkalianRecursive(6, 8));
    }

    static int perkalianRecursive(int value1, int value2) {
        if(value2 == 0) {
            return 0;
        } else {
            return value1 + perkalianRecursive(value1, value2-1);
        }
    }

    public static void main6(String[] args) {
        loop(10);
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop" + value);
            loop(value-1);
        }
    }
}
