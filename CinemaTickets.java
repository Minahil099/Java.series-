import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age of person " + i + ": ");
            int age = sc.nextInt();

            if (age < 12) {
                System.out.println("Ticket Price: Rs.200");
            } else if (age >= 60) {
                System.out.println("Ticket Price: Rs.500");
            } else {
                System.out.println("Ticket Price: Rs.100");
            }
        }
        sc.close();
    }
}