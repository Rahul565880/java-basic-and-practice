import java.util.Scanner;

public class FibonaccieSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = s.nextInt();
        int num1=0;
        int  num2= 1;
        for (int i =2;i<num;i++){
            int num3=num1+num2;
            System.out.println( num3);
            num1=num2;
            num2=num3;
        }
    }
}
