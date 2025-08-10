package Belajar;

public class BreakContinue {
    public static void main(String[] args) {
        var counter1 = 10;
        while (true) {
            System.out.println("Perulangan ke-" + counter1);
            counter1--;

            if (counter1 < 1) {
            break;
            }   
        }

        System.out.println("Perulangan berhenti");

        var counter2 = 1;

        do {
            System.out.println("Perulangan ke " + counter2);
            counter2++;
        } while (counter2 <= 10);

        for (int counter3 = 1; counter3 <= 100; counter3++) {
            if (counter3 % 4 > 0 || counter3 % 6 > 0 || counter3 % 5 == 0) {
                continue;
            }
            
            System.out.println("Perulangan " + counter3);
        }
    }
    
}
