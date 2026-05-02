import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scan.nextInt();
        int original=n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev *10+rem;
            n=n/10;
        }
        if(original==rev){
            System.out.println("the number is palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }



}
