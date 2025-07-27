package Belajar;

public class For {
    public static void main(String[] args) {
        var counter = 1;

        for(; counter <= 10;) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        for (var counter1 = 1; counter1 <= 10;) {
            System.out.println("Perulangan ke-" + counter1);
            counter1++;
        }

        var counter2 = 1;

        while (counter2 <= 10) {
            System.out.println("Perulangan" + counter2);
            counter2++;
        }

        var counter3= 20;

        do {
            System.out.println("Perulangan ke-" + counter3);
            counter3++;
        } while (counter3 <=20);
    }
}
