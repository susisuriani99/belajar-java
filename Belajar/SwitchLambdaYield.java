package Belajar;

public class SwitchLambdaYield {
    public static void main(String[] args) {

        var nilai = "A";

        switch(nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B", "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Silahkan Coba Lagi");
        }

        var nilai1 = "A";
        String ucapan;

        switch(nilai1) {
            case "A" -> ucapan = "Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Silahkan Coba Lagi";
        }

        System.out.println(ucapan);

        var nilai2 = "A";

        switch(nilai2) {
            case "A" -> System.out.println("Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Silahkan Coba Lagi");
            }
        }

        String ucapan1 = switch (nilai) {
            case "A":
                yield "Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Silahkan Coba Lagi";

        };

        System.out.println(ucapan1);
        
        
    }

}