

public class AreaCalculator {

    // Circle
    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Rectangle
    static double area(double length, double width) {
        return length * width;
    }

    // Square
    static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        System.out.println("Circle: " + area(5.0));
        System.out.println("Rectangle: " + area(4.0, 6.0));
        System.out.println("Square: " + area(4));
    }
}