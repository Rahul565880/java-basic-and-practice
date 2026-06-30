


	import java.sql.SQLOutput;
    import java.util.Scanner;

    public class StringConcat {
        public static void main(String[] args) {

            String a = "rahul";
            String b = "pawar";
            String c = a.concat(b);
            System.out.println(c);

            System.out.println("-----------------------------------------");
            Scanner scanner = new Scanner(System.in);

            // Read the original username
            String ou = scanner.next();

            // Read the suffix to append
            String suf = scanner.next();

            // Create a new username
            String newu = ou.concat(suf);

            // Print both the original and new usernames (Fixed typo here)
            System.out.println("Original Username: " + ou);
            System.out.println("New Username: " + newu);


            scanner.close();
        }
    }