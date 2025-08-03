package Belajar;

public class BreakContinue {
    public static void main(String[] args) {
        var counter1 = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter1);
            counter1++;

            if (counter1 > 10) {
            break;
            }
        }

        var counter2 = 100;

        do {
            System.out.println("Perulangan ke-" + counter2);
            counter2++;
        } while (counter2 <= 10); 
    }
    
}
