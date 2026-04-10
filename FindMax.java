public class FindMax {

    static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    static double findMax(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(findMax(10, 20));
        System.out.println(findMax(5.5, 3.2));
    }
}