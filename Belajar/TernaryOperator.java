package Belajar;

public class TernaryOperator {
    public static void main(String[] args) {

    var nilai = 75;
    String ucapan;

        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Anda Tidak Lulus";
        }

        System.out.println(ucapan);

        String ucapan1 = nilai >= 75? "Selamat Anda Lulus" : "Anda Tidak Lulus";

        System.out.println(ucapan1);

    }

}