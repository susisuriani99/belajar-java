package Belajar;

public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Susi", 80,90,75);
    }

    static void sayCongrats(String name, int... nilai) {
        var total = 0;
        for (var n : nilai) {
            total += n;
        }

        var finalValue = total / nilai.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + "Anda Tidak Lulus");
        }
    }
}
