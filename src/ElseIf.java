import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner n = new Scanner(System.in);
        int age = n.nextInt();

        if (age > 56) {
            System.out.println("you are experienced ");
        } else if (age > 46) {
            System.out.println(" you are semi experienced ");
        } else if (age > 36) {
            System.out.println("you are semi-semi experienced ");


        }
        else {
            System.out.println("you are not experineced ");
        }
    }
}
