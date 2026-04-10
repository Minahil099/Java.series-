import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 10;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i--;
        } while (i >= 1);
        sc.close();
    }
}