
   import java.util.Scanner;

   public class StringSplitAndJoin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the full input sentence
            String s = scanner.nextLine();

            // Read the target delimiter string
            String del = scanner.nextLine();

            // Split the sentence into words using a space delimiter
            String w[] = s.split(" ");

            // Print the split words heading and the individual words
            System.out.println("Split words:");
            for (String word : w) {
                System.out.println(word);
            }

            // Join the words with the new delimiter and print the result
            String joinedSentence = String.join(del, w);
            System.out.println("Joined sentence: " + joinedSentence);

            scanner.close();
        }
    }