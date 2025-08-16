package Belajar;

public  class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a,b);

        var d = 300;
        var e = 50;
        var f = sum(d,e);

        var g = 350;
        var h = 150;
        var i = sum(g,h);

        System.out.println(c);
        System.out.println(f);
        System.out.println(i);
        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 50));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch(operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}