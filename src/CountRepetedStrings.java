
import java.util.Scanner;

public class CountRepetedStrings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Use nextLine() to capture the full string including spaces
            String s = scanner.nextLine();
            char t = scanner.next().charAt(0);

            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                // 2. Put count++ inside the actual if condition block
                if (s.charAt(i) == t) {
                    count++;
                }
            }

            // 3. Print the results matching the expected format
            System.out.println("Original String: " + s);
            System.out.println("Character: " + t);
            System.out.println("Occurrences: " + count);

            scanner.close();
        }
    }
