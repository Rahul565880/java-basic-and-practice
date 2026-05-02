import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =scan.nextInt();
        if(n>0){
            System.out.println("number is positive ....");
        } else if (n<0) {
            System.out.println("number is negative.... ");

        }
        else {
            System.out.println("Zeroooooo");
        }
    }
}
