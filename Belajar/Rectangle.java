package Belajar;

public class Rectangle extends Shape {
    int getcorner() {
        return 5;
    }

    int getParentCorner() {
        return super.getcorner();
    }

    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getcorner());
        var rectangle = new Rectangle();
        System.out.println(rectangle.getParentCorner());
        System.out.println(rectangle.getcorner());
    }
}
