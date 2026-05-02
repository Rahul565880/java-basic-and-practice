import java.util.Scanner;

public class CheckTheNumberEvenOROdd {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner n=new Scanner(System.in);
        int n1=n.nextInt();
        if(n1%2==0) {
            System.out.println("your numeber  " + n1 + " is even");
        }
        else {
            System.out.println("the given number is odd");
        }
    }
}
