import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scan.nextInt();
        int count =0 ;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("It is prime number ......");
        }
        else {
            System.out.println("not a prime number........");
        }
    }
}
