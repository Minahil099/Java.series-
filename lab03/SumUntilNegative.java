import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        do {
            num = sc.nextInt();
            if (num >= 0)
                sum += num;
        } while (num >= 0);

        System.out.println("Total: " + sum);
        sc.close();
    }
}
