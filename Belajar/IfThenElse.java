package TipeDataNumber;

public class IfThenElse {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 70;

        if(nilai >= 85 && absen >= 85) {
            System.out.println("Nilai A");
        } else if(nilai >= 75 && absen >= 75) {
            System.out.println("Nilai B");
        } else if (nilai >= 60 && absen >= 70) {
            System.out.println("Nilai C");
        } else if(nilai >= 50 && absen >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }

        var nilai1 = "A";

        switch(nilai1) {
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Anda Salah Jurusan");
        }

        var nilai2 = "A";

        switch(nilai2) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik");
            case "B" , "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda Salah Jurusan");
            }
        }

        var nilai3 = "A";
        String ucapan;

        switch(nilai3) {
            case "A" -> ucapan = "Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Anda Salah Jurusan";
        }
        System.out.println(ucapan);
    }
}
