
	import java.util.Scanner;

    public class CountVowels {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string:");
            String s = scanner.nextLine();

            int count = 0;
            for (int i = 0; i <= s.length() - 1; i++) {
                char ch = s.charAt(i);
                // Checking for both lowercase and uppercase vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }

            System.out.println("Original String: " + s);
            System.out.println("Number of vowels: " + count);

            scanner.close();
        }
    }
