import java.util.Scanner;


public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input string
        String s = scanner.next();

        // Check if it is a palindrome
        String rev = new StringBuilder(s).reverse().toString();

        // Print result
        if (s.equals(rev)) {
            System.out.println("The string '" + s + "' is a palindrome.");
        } else {
            System.out.println("The string '" + s + "' is not a palindrome.");
        }

        scanner.close();
    }
}