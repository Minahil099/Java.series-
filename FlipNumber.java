public class FlipNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;

        System.out.println("Original number: " + number);

        while (number != 0) {
            int lastDigit = number % 10;   // Step 1: Get last digit (e.g., 4)
            reversed = reversed * 10 + lastDigit; // Step 2: Append to reversed
            number = number / 10;          // Step 3: Remove last digit
        }

        System.out.println("Flipped number: " + reversed);
    }
}