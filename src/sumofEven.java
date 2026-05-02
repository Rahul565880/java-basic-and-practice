import java.util.Scanner;

public class sumofEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =scan.nextInt();
        int sumeven=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {


                sumeven = sumeven + i;
            }
        }
        System.out.println(sumeven);
}}

