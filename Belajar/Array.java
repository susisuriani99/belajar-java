package Belajar;

public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Susi";
        arrayString[1] = "Suriani";
        arrayString[2] = "Winata";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[] {
            10, 20, 30, 40, 50
        };
        long[] arrayLong = new long[] {
            10L, 20L, 30L, 40L, 50L
        };

        System.out.println(arrayInt[1]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        String[][] members = {
            {"Susi, Suriani", "Winata"},
            {"Ryani", "Win", "Adi"},
        };

        String[] member1 = members[0];
        String[] member2 = members[1];
        System.out.println(member1[1]);
        System.out.println(member2[1]);
        System.out.println(members[1][1]);
    }
}
