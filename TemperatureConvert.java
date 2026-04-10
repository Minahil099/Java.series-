import java.util.Scanner;

public class TemperatureConvert {

    // Celsius to Fahrenheit
    static double convert(double c) {
        return (c * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    static double convert(int f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for C->F, 2 for F->C: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + convert(c));
        } else {
            System.out.print("Enter Fahrenheit: ");
            int f = sc.nextInt();
            System.out.println("Celsius: " + convert(f));
        }
        sc.close();
    }
}