import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 50) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }
        sc.close();
    }
}
