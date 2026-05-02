import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scan.nextInt();
        int fib1 = 0, fib2 = 1;
        for (int i=1;i<=n;i++){
            System.out.println(fib1);
            int fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;

        }




    }



}
