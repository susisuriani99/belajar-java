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

        var counter3= 1;

        do {
            System.out.println("Perulangan ke-" + counter3);
            counter3++;
        } while (counter3 <=20);

        var counter4 = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter4);
            counter4++;

            if (counter4 >10) {
                break;
            }

        }


        for(int counter5 = 1; counter5 <=50; counter5++) {
            if (counter5 % 2 == 0) {
                continue;
            }
        System.out.println("Perulangan Ganjil " + counter5);
        }


        String[] array = {
            "Susi", "Suriani", "Ryani", "Made", "Winata", "Adi"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

/*
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 * @@@@@@
 * @@@@@@@
 * @@@@@@@@
 * @@@@@@@@@
 * @@@@@@@@@@
 */