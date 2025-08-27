package Belajar;

public class Susi extends Person {
    Susi() {
        super("Susi Suriani", "Ciputat", 26);
    }
    public static void main(String[] args) {
        Susi susi = new Susi();
        susi.name = "Suriani";
        susi.country = "Indonesia";
    }
}
