import java.util.Scanner;

public class SmartLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter brightness for room " + i + ": ");
            int brightness = sc.nextInt();

            if (brightness < 30) {
                System.out.println("Lights ON");
            } else if (brightness <= 70) {
                System.out.println("Dim Lights");
            } else {
                System.out.println("Lights OFF");
            }
        }
        sc.close();
      }
}
