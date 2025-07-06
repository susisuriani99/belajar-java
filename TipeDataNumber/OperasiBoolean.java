package TipeDataNumber;

public class OperasiBoolean {

    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 85;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 80;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        if(absen >= 70 && nilaiAkhir >= 80) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
    }
    
}
