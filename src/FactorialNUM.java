import java.util.Scanner;

public class FactorialNUM {
    public static void main(String[] args) {
        System.out.println("Enter the number :" );
        Scanner j=new Scanner(System.in);
        int n=j.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);

    }
}

