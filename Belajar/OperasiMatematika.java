package TipeDataNumber;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 5;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a % b);
        System.out.println(b / a);
        System.out.println(b / c);

        int d = 20;
        
        d += 10;
        System.out.println(d);

        d -= 20;
        System.out.println(d);

        d *= 10;
        System.out.println(d);

        int e = 100;
        int f = -20;

        e++;
        System.out.println(e);

        e--;
        System.out.println(e);

        f++;
        System.out.println(f);

        f--;
        System.out.println(f);

        System.out.println(!true);

        int value1 = 50;
        int value2 = 10;

        System.out.println(value1 > value2);
        System.out.println(value1 < value2);   
        System.out.println(value1 <= value2);
        System.out.println(value1 >= value2);  
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);
    }
    
}
