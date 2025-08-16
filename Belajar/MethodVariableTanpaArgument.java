package Belajar;

public class MethodVariableTanpaArgument {
    public static void main(String[] args) {
        int[] nilai = {70,80,85};
        sayCongrats("Susi", nilai);
    }
    static void sayCongrats (String name, int[] nilai) {
        var total = 0;
        for (var n : nilai) {
            total += n;
        }

        int finalNilai = total / nilai.length;
        if (finalNilai >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
