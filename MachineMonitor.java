import java.util.Scanner;

public class MachineMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int hour = 1; hour <= 4; hour++) {
            System.out.print("Enter temperature for hour " + hour + ": ");
            int temp = sc.nextInt();

            if (temp > 80) {
                System.out.println("CRITICAL");
            } else if (temp >= 51) {
                System.out.println("NORMAL");
            } else {
                System.out.println("IDLE");
            }
        }
        sc.close();
    }
}