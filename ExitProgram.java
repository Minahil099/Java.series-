import java.util.Scanner;

public class ExitProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            num = sc.nextInt();
        } while (num != 5);

        System.out.println("Exited");
        sc.close();
    }
}